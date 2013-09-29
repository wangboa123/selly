!function ($){
	addHeader();
	addFooter();

	var homepage = true;
	$('div.menu ul li a').each(function(){
		if($($(this))[0].href ==String(window.location)){
			$(this).parent().addClass('current-page');
			homepage = false; 
		}
	});

	if(homepage){
		$('div.menu ul li:first-child').addClass('current-page');
	}
	$('a.ajax-link').click(function(e)
	{
		$click = $(this);
		History.pushState(null,null,$click.attr(href));
		e.preventDefault();
	});
	//恢复到原先的状态
			
}(window.jQuery);

function addHeader(){
	var headStr='<div class="container">';
 	headStr+=       '    <div class="header row">';
        headStr+=       '        <div class="span12">';
        headStr+=       '            <div class="navbar">';
        headStr+=       '                <div class="navbar-inner">';
        headStr+=       '                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">';
        headStr+=       '                        <span class="icon-bar"></span>';
        headStr+=       '                        <span class="icon-bar"></span>';
        headStr+=       '                        <span class="icon-bar"></span>';
        headStr+=       '                    </a>';
        headStr+=       '                    <h1>';
        headStr+=       '                        <a class="brand" href="index.html">我的家园</a>';
        headStr+=       '                    </h1>';
        headStr+=       '                    <div class="nav-collapse collapse menu">';
        headStr+=       '                        <ul class="nav pull-right">';
        headStr+=       '                            <li class="">';
        headStr+=       '                                <a class="ajax-link" href="/menu/index"><i class="icon-home"></i><br />主页</a>';
        headStr+=       '                            </li>';
        headStr+=       '                            <li>';
        headStr+=       '                                <a  class="ajax-link"  href="/menu/men"><i class="icon-camera"></i><br />男装</a>';
        headStr+=       '                            </li>';
        headStr+=       '                            <li>';
        headStr+=       '                                <a h class="ajax-link" ref="/menu/women"><i class="icon-comments"></i><br />女装</a>';
        headStr+=       '                            </li>';
        headStr+=       '                            <li>';
        headStr+=       '                                <a  class="ajax-link" href="/menu/services"><i class="icon-tasks"></i><br />推荐搭配</a>';
        headStr+=       '                            </li>';
        headStr+=       '                            <li>';
        headStr+=       '                                <a  class="ajax-link" href="/menu/about"><i class="icon-user"></i><br />限时优惠</a>';
        headStr+=       '                            </li>';
        headStr+=       '                            <li>';
        headStr+=       '                                <a  class="ajax-link" href="contact"><i class="icon-envelope-alt"></i><br />联系我们</a>';
        headStr+=       '                            </li>';
        headStr+=       '                        </ul>';
        headStr+=       '                    </div>';
        headStr+=       '                </div>';
        headStr+=       '            </div>';
        headStr+=       '        </div>';
        headStr+=       '    </div>';
	
	$('#allContent').prepend(headStr);
	
}

function addFooter(){
	var footerStr = '<footer>';
	
        footerStr +='    <div class="container">';
        footerStr +='            <div class="row">';
        footerStr +='                 <div class="widget span3">';
        footerStr +='                    <h4>关于我们</h4>';
        footerStr +='                     <p>我们是国内一家有实力的服装销售公司，我们公司的产品以新颖、时尚为主。主打当年流行款式，欢迎各位到店购买</p> ';
	footerStr +='     		<p><a href="">更多</a></p>';
        footerStr +='                 </div>';
        footerStr +='                 <div class="widget span3">';
        footerStr +='                     <h4>购物指南</h4>';
        footerStr +='                     <div class="show-tweets"></div>';
        footerStr +='                 </div>';
        footerStr +='                 <div class="widget span3">';
        footerStr +='                     <h4>售后服务</h4>';
        footerStr +='                     <ul class="flickr-feed"></ul>';
        footerStr +='                 </div>';
        footerStr +='                 <div class="widget span3">';
        footerStr +='                     <h4>联系我们</h4>';
        footerStr +='                     <p><i class="icon-map-marker"></i> 地址: 重庆市沙坪坝区沙正街174号</p>';
        footerStr +='                     <p><i class="icon-phone"></i> 电话: 1393900****</p>';
        footerStr +='                     <p><i class="icon-user"></i> QQ: 100000</p>';
        footerStr +='                     <p><i class="icon-envelope-alt"></i> Email: <a href="">helloworld@163.com</a></p>';
        footerStr +='                 </div>';
        footerStr +='             </div>';
        footerStr +='             <div class="footer-border"></div>';
        footerStr +='             <div class="row">';
        footerStr +='                 <div class="copyright span4">';
        footerStr +='                     <p>Copyright 2012 meehoo- All rights reserved. </a>.</p>';
        footerStr +='                 </div>';
        footerStr +='                 <div class="social span8">';
        footerStr +='                     <a class="facebook" href=""></a>';
        footerStr +='                     <a class="dribbble" href=""></a>';
        footerStr +='                     <a class="twitter" href=""></a>';
        footerStr +='                     <a class="pinterest" href=""></a>';
        footerStr +='                                 </div>';
        footerStr +='                             </div>';
        footerStr +='                         </div>';
        footerStr +='                         </footer>';
	
	$('#afterFooter').before(footerStr);
}
