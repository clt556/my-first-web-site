<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/test/css/reset.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />
    <script src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>
    <title>Document</title>
    <link rel="stylesheet" href="/test/css/style.css"/>
    <script src="/test/resources/js/common.js"></script>
    <script src="/test/resources/js/main.js"></script>
</head>
<body>
    <div class="divPop">
        <img src="/test/resources/img/event_popup.png"/>
    </div>
    <div class="wrap">
        <div class="header">
            <div class="size">
                <div><img class="logo" src="/test/resources/img/logo.png"></div>
                <div class="login">
                    <a href="">로그인</a> |
                    <a href="">회원가입</a>
                </div>
            </div>
        </div>
        <div class="menu">
            <ul class="depth1">
                <li>
                    <a href="" >회사소개</a>
                    <ul class="depth2">
                        <li><a href="" >MENU1-1</a></li>
                        <li><a href="" >MENU1-2</a></li>
                        <li><a href="map.html" >오시는길</a></li>
                    </ul>
                </li>
                <li>
                    <a href="" >MENU2</a>
                    <ul class="depth2">
                        <li><a href="" >MENU2-1</a></li>
                        <li><a href="" >MENU2-2</a></li>
                        <li><a href="" >MENU2-3</a></li>
                    </ul>
                </li>
                <li>
                    <a href="" >MENU3</a>
                    <ul class="depth2">
                        <li><a href="" >MENU3-1</a></li>
                        <li><a href="" >MENU3-2</a></li>
                        <li><a href="" >MENU3-3</a></li>
                    </ul>
                </li>
                <li>
                    <a href="" >MENU4</a>
                    <ul class="depth2">
                        <li><a href="" >MENU4-1</a></li>
                        <li><a href="" >MENU4-2</a></li>
                        <li><a href="" >MENU4-3</a></li>
                    </ul>
                </li>
                <li>
                    <a href="" >MENU5</a>
                    <ul class="depth2">
                        <li><a href="" >MENU5-1</a></li>
                        <li><a href="" >MENU5-2</a></li>
                        <li><a href="" >MENU5-3</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="visual">
            <div class="swiper-area">
                <div class="swiper-wrapper">
                    <div class="swiper-slide" style="background-image: url('/test/resources/img/visual1.png');"></div>
                    <div class="swiper-slide" style="background-image: url('/test/resources/img/visual2.png');"></div>
                    <div class="swiper-slide" style="background-image: url('/test/resources/img/visual3.png');"></div>
                    <div class="swiper-slide" style="background-image: url('/test/resources/img/visual4.png');"></div>
                </div>
                <div class="swiper-pagination"></div>
                <div class="swiper-button-next"></div>
                <div class="swiper-button-prev"></div>
            </div>
        </div>
        <div class="container">
            <div class="size">
                <div class="section">
                    <img src="/test/resources/img/section1_1.png">
                </div>
                <div class="section">
                    <img src="/test/resources/img/section1_2.png">
                </div>
                <div class="section">
                    <img src="/test/resources/img/section1_3.png">
                </div>
                <div class="section">
                    <img src="/test/resources/img/section1_1.png">
                </div>
                <div class="section">
                    <img src="/test/resources/img/section1_2.png">
                </div>
                <div class="section">
                    <img src="/test/resources/img/section1_3.png">
                </div>
            </div>
        </div>
        <div class="info">
            <div class="content">
                <div class="board_area">
                    <div class="board_title on" data-type="board_notice">공지사항</div>
                    <div class="board_title" data-type="board_data">자료실</div>
                    <div class="board_title" data-type="board_news">뉴스</div>
                    <div class="board_content" id="board_notice">
                        <ul>
                            <li>공지사항입니다. <span>2023-01-01</span></li>
                            <li>공지사항입니다. <span>2023-01-01</span></li>
                            <li>공지사항입니다. <span>2023-01-01</span></li>
                            <li>공지사항입니다. <span>2023-01-01</span></li>
                            <li>공지사항입니다. <span>2023-01-01</span></li>
                        </ul>
                    </div>
                    <div class="board_content" id="board_data">
                        <ul>
                            <li>자료실입니다. <span>2023-01-01</span></li>
                            <li>자료실입니다. <span>2023-01-01</span></li>
                            <li>자료실입니다. <span>2023-01-01</span></li>
                            <li>자료실입니다. <span>2023-01-01</span></li>
                            <li>자료실입니다. <span>2023-01-01</span></li>
                        </ul>
                    </div>
                    <div class="board_content" id="board_news">
                        <ul>
                            <li>뉴스입니다. <span>2023-01-01</span></li>
                            <li>뉴스입니다. <span>2023-01-01</span></li>
                            <li>뉴스입니다. <span>2023-01-01</span></li>
                            <li>뉴스입니다. <span>2023-01-01</span></li>
                            <li>뉴스입니다. <span>2023-01-01</span></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="content">
                <div class="video_area">
                    <iframe width="100%" height="350" src="https://www.youtube.com/embed/yRyM6yZAgFk" title="디아블로 4는 블리자드의 마지막 희망에 어울리는 게임이었을까?" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
                </div>
            </div>
        </div>
        <div class="footer">
            <div class="size">
                <div class="info">
                    <p>신한DS SW아카데미</p>
                    <p>서울시 마포구 월드컵북로 4길 77</p>
                    <p>대표자 서민구 | 개인정보책임자 홍길동</p>
                    <p>02-1234-5678 | 02-9876-5432</p>
                    <p>사업자번호 123-45-6789</p>
                </div>
                <div class="sns_area">
                    <a href=""><img src="/test/resources/img/blog_ico.png"></a>
                    <a href=""><img src="/test/resources/img/facebook_ico.png"></a>
                    <a href=""><img src="/test/resources/img/insta_ico.png"></a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>