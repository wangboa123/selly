
<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <title>Andia - Responsive Agency Template</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
 <!--       <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,400">
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Droid+Sans">
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Lobster">-->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/prettyPhoto/css/prettyPhoto.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/flexslider.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/font-awesome.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

    </head>

    <body>
        <!-- Header -->
	<div class="wrapper" id="allContent">

        <!-- Slider -->
        <div class="slider">
            <div class="container">
                <div class="row">
                    <div class="span10 offset1">
                        <div class="flexslider">
                            <ul class="slides">
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <!-- portfolio 1-->
        <div class="portfolio container">
            <div class="portfolio-title">
                <h3>精品推荐</h3>
            </div>
        </div>


        <!-- Javascript -->
	<div class="hide" id="afterFooter"></div>
        <script src="<%=request.getContextPath()%>/resources/assets/js/jquery-1.8.2.min.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/js/jquery.flexslider.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/js/jquery.tweet.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/js/jflickrfeed.js"></script>
<!--        <script src="http://maps.google.com/maps/api/js?sensor=true"></script>-->
        <script src="<%=request.getContextPath()%>/resources/assets/js/jquery.ui.map.min.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/js/jquery.quicksand.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/prettyPhoto/js/jquery.prettyPhoto.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/js/scripts.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/js/scaffold.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/js/selly/show16pic.js"></script>
		<script src="<%=request.getContextPath()%>/resources/assets/js/selly/index.js"></script>
	</div>
    </body>

</html>

