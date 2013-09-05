function show16pic(type){
	$.ajax({
		url:'get16pic.html',
		data:{'type':type}
		success:function(ret){
			//ret中保存的是16张图片地址的json
			//json数据格式为: ret{name:16pic,num:16,values:[{img:pic1,title:h1,content:p,price:120,discountPrice:80},{pic2},...,{pic16}]}

		}
	
	});
}
