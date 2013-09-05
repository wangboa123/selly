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

function composeProfile(jsonData){
	var contentHtml="";	
        contentHtml +=<div class="portfolio container">
			
         contentHtml +=   <div class="portfolio-title">
 contentHtml +=               <h3>精品推荐</h3>
 contentHtml +=           </div>
 contentHtml +=           <div class="row">
               contentHtml += <div class="work span3">
 contentHtml +=                   <img src="assets/img/portfolio/jp1.jpg" alt="">
               contentHtml +=     <h4>针织背心</h4>
                    contentHtml +=<p>夏装新品，休闲时尚系列</p>
                contentHtml +=</div>
                contentHtml +=<div class="work span3">
                  contentHtml +=  <img src="assets/img/portfolio/jp2.jpg" alt="">
                  contentHtml +=  <h4>拼接背心</h4>
                   contentHtml += <p>夏装新品，休闲时尚系列</p>
		contentHtml +=</div>
                contentHtml +=<div class="work span3">
                    contentHtml +=<img src="assets/img/portfolio/jp3.jpg" alt="">
                    contentHtml +=<h4>针织短袖</h4>
                    contentHtml +=<p>男士三角图案印花元领针织短袖T恤</p>
                contentHtml +=</div>
                contentHtml +=<div class="work span3">
                    contentHtml +=<img src="assets/img/portfolio/jp4.jpg" alt="">
                    contentHtml +=<h4>v领短袖</h4>
                    contentHtml +=<p>男人印花V领短袖T恤</p>
		contentHtml +=</div>
            contentHtml +=</div>
         contentHtml +=</div>
} 
