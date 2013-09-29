!function($){
	//������������������������������������ajax���������������������������������������������������������������������������
	//������������������������������������������������������������16���
	$.ajax({
		url:'/selly/scrollfour',
		success:function(ret){
			//ret���������������scroll���url������������������json������
			//���������json���������������������������������������������������������
			//json���������������:ret{name:scroll,num:4,values:[{pic1}.jpg,{pic2}.jpg,{pic3.jpg},{pic4.jpg}]}	
			//������������jquery���html������������������ ���������	
			var sliderHtml = "<li data-thumb="+ret.values[0]+">";
			sliderHtml    +=	"<img src="+ret.values[0]+">";
			sliderHtml     += "</li>";
			sliderHtml += "<li data-thumb="+ret.values[1]+">";
			sliderHtml    +=	"<img src="+ret.values[1]+">";
			sliderHtml     += "</li>";
			sliderHtml += "<li data-thumb="+ret.values[2]+">";
			sliderHtml    +=	"<img src="+ret.values[2]+">";
			sliderHtml     += "</li>";
			sliderHtml += "<li data-thumb="+ret.values[3]+">";
			sliderHtml    +=	"<img src="+ret.values[3]+">";
			sliderHtml     += "</li>";

			$('.slides').html(sliderHtml);
		}
	});	
	
	show16pic(0);
}(window.jQuery);

