/**


 @Name: 发单管理模块
 */
layui.define(['laypage', 'fly', 'element', 'laydate','table','layer','upload'], function(exports){
	var $ = layui.jquery;
	var fly = layui.fly;
	var table = layui.table;
	var laydate = layui.laydate;
	var layer=layui.layer;
	var element=layui.element;
	var upload=layui.upload;
	//发单管理分页
	  table.render({
	        elem: '#pubList'
	            ,url: '/product/mine/'
	            ,method: 'post'
	            ,where: function(){
	                var where = {}
	                    ,alias = layui.data.alias;
	                if(alias) where.alias = alias;
	                return where;
	            }()
	            ,cols: [[
	            	{type:'checkbox',fixed: 'left'},
	                {field: 'name',title: '产品名称', minWidth: 300, templet: function(d){
	                    var href = d.name || ('/product/'+ d.productId+'/download');
	                    return '<a href="'+ href +'" target="_blank" class="layui-table-link">'+ d.name + '</a>'
	                }}
	                ,{field: 'expiryTime', title: '授权有效期', width: 120, templet: function(d){
	                    return d.expiryTime ? d.expiryTime : '永久';
	                }}
	                ,{field: 'price', title: '付费金额', width: 120, templet: function(d){
	                    return '<span style="color: #FF5722;">￥'+ (d.price || 0) +'</span>';
	                }}
	                ,{title: '操作', width: 100, templet: function(d){
	                    if(false){
	                        return '<a href="/order/bill?itemid='+ d.productId +'" style="color: #FF5722;" target="_blank">重新授权</a>';
	                    } else {
	                        return '<a href="/product/'+ d.productId +'/download" class="layui-table-link" target="_blank">下载</a>';
	                    }
	                }}
	            ]]
	            ,page: true
	            ,text: {
	                none: function(){
	                    var where = {}
	                        ,alias = layui.data.alias;
	                    return alias ? '未查询到你的 '+ alias +' 授权记录' : '您还没有任何产品授权'
	                }()
	            }
	            ,done: function(res, curr){
	                //无数据
	                if(res.data.length === 0 && curr == 1){

	                }
	            }
	        });
	  laydate.render({
		    elem: '#pubDate,#pubDate2',
	       value:"2020-02-03"
		  });
	  laydate.render({
		    elem: '#pubDate2',		   
		    value:"2020-03-03"
		  });
	  /*
	   * 发布订单弹出层
	   * */
	  $("[data-method='newOrder']").on("click",function(){
		  var tpl=$('#pubOrder').find("div:eq(1)").html();
		  layer.open({
			  title: '新建订单',
			  type: 2,
			  content:"/pubManage/pubOrder",
			  area:['800px','700px'],
			}); 
	  });
	  /*发布按钮
	     * 金额确认弹出层
	     *  data-method="publish"
	   * */
	  $("[data-method='publish']").on("click",function(){
		 /* pubIndex = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
		  parent.layer.close(pubIndex);*/
		  var tpl=$("#pubListDiv").find("div:eq(0)").html();
		  layer.open({
			  title: '确认金额',
			  type:1,
			  content:tpl,
			  btn: ['确认', '取消'],
			  yes: function(index, layero){
				  layer.closeAll();
				  pubIndex = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
				  parent.layer.close(pubIndex);//关闭iframe弹出层
				  },
		      btn2: function(index, layero){
		    	  layer.close(index);}
			});
	  });
	  table.on('rowDouble(showDetail)', function(obj){
			 layer.open({
				  title: '订单22454',
				  scrollbar: false,
				  type: 2,
				  content:"/acceptOrder/myOrderDetail",
				  area:['800px','700px'],
				/*  success:function(layero,index){
				  }*/
				}); 
			});
	  var uploadInst = upload.render({//layui文件上传插件
		    elem: '#previewFile',
		    url: 'https://httpbin.org/post', //改成您自己的上传接口 
		    auto:false,
		    bindAction: '#uploadFile',
		    accept: 'images',
		    acceptMime: 'image/*',
		    choose: function(obj){
		      //预读本地文件示例，不支持ie8
		      obj.preview(function(index, file, result){
		    	  $('#showImage').addClass("ui-height200");
		        $('#showImage').attr('src', result); //图片链接（base64）
		      });
		    }
		    ,done: function(res){
		      //如果上传失败
		      if(res.code > 0){
		        return layer.msg('上传失败');
		      }
		      //上传成功
		    }
		    ,error: function(){
		      //演示失败状态，并实现重传
		      var demoText = $('#demoText');
		      demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
		      demoText.find('.demo-reload').on('click', function(){
		        uploadInst.upload();
		      });
		    }
		  });
			 
  
  exports('acceptOrder', null);
});