function show16pic(type){
	$.ajax({
		url:'get16pic.html',
		data:{'type':type},
		success:function(ret){
			//ret中保存的是16张图片地址的json
			//json数据格式为: ret{name:16pic,num:16,values:[{img:pic1,title:h1,content:p,price:120,discountPrice:80},{pic2},...,{pic16}]}
		composeProfile(ret);	
		}
	
	});
}

function composeProfile(jsonData){
	var profileHtml='';
	for(var i=0;i<jsonData.num/4;i++){
        contentHtml +='           <div class="row">';
        contentHtml +=' <div class="work span3">';
        contentHtml +='                   <img src="'+jsonData.values[i*4].img+'" alt="">';
        contentHtml +='     <h4>'+jsonData.values[i*4].title+'</h4>';
        contentHtml +='<p>'+jsonData.values[i*4].content+'</p>';
        contentHtml +='</div>';  
		contentHtml +=' <div class="work span3">';
        contentHtml +='                   <img src="'+jsonData.values[i*4+1].img+'" alt="">';
        contentHtml +='     <h4>'+jsonData.values[i*4+1].title+'</h4>';
        contentHtml +='<p>'+jsonData.values[i*4+1].content+'</p>';
        contentHtml +='</div>';
        contentHtml +=' <div class="work span3">';
        contentHtml +='                   <img src="'+jsonData.values[i*4+2].img+'" alt="">';
        contentHtml +='     <h4>'+jsonData.values[i*4+2].title+'</h4>';
        contentHtml +='<p>'+jsonData.values[i*4+2].content+'</p>';
        contentHtml +='</div>';
        contentHtml +=' <div class="work span3">';
        contentHtml +='                   <img src="'+jsonData.values[i*4+3].img+'" alt="">';
        contentHtml +='     <h4>'+jsonData.values[i*4+3].title+'</h4>';
        contentHtml +='<p>'+jsonData.values[i*4+3].content+'</p>';
        contentHtml +='</div>';
		contentHtml +='</div>';
        contentHtml +='</div>';
	}
	$('.portfolio').html(contentHtml);
	return contentHtml; //便于做单元测试
} 
function testfun(data){
	if(data==0)return 0;
	if(data==1)return 1;
	if(data==2)return 2;
}
