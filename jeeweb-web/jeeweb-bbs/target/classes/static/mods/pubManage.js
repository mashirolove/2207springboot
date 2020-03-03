/**


 @Name: 发单管理模块
 */
layui.define(['laypage', 'fly', 'element', 'laydate','table','layer'], function(exports){
	var $ = layui.jquery;
	var fly = layui.fly;
	var table = layui.table;
	var laydate = layui.laydate;
	var layer=layui.layer;
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
	  $("[data-method='newOrder']").on("click",function(){
		  var tpl;
		  debugger;
		  $.get("../pubManage/pubOrder.html",function(data,status){
			  tpl=data;
		  })
		  layer.open({
			  title: '新建订单',
			  type: 1,
			  content:tpl,
			  /*content:'弹出层'*/
			});
		  
	  });
			 
  
  exports('pubManage', null);
});