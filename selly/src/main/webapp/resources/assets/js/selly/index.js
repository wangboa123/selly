!function($){
	//等页面家加载完，首先使用ajax请求，获取开始的四张滚动的图片的地址，然后加载近来
	//然后就获取新品的地址，加载近来。新品使用16个
	$.ajax({
		url:'scrollfour.html',
		success:function(ret){
			//ret中保存的是scroll的url地址，是一个json对象
			//将这个json对象解析出来，然后将结果赋给滚动的图片
			//json数据格式为:ret{name:scroll,num:4,value:[{pic1.jpg,pic2.jpg,pic3.jpg,pic4.jpg}]}	
			//这里加上jquery的html操作就好了。 晚点加	
		}
	});	
}(window.jQuery);

