﻿<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="kor">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mandoo</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="board-styleemp.css">
    <link rel="stylesheet" href="CSS/생산현황.css">
    <link rel="stylesheet" href="CSS/작업지시서(작업자).css">
</head>

<body>

    <!-- 메인 -->
    <div class="category">

        <!-- 메뉴 아이콘 -->
        <div class="menu-icon">
            <img class="menu-icon" src="image/menu.png">
        </div>

        <!-- 로고 아이콘 -->
        <div class="category-item">
            <a href="index.jsp" class="category-link"><img class="logo-icon" src="image/logo.png"></a>
        </div>

        <!-- 카테고리 -->
        <div class="category-item">
            <a href="HTML/BOMemp.jsp" class="category-link">BOM</a>
        </div>

        <div class="category-item">
            <a href="HTML/작업지시서(작업자용)emp.jsp" class="category-link">생산계획</a>
        </div>

        <div class="category-item">
            <a href="HTML/재고현황emp.jsp" class="category-link">재고관리</a>
        </div>

        <div class="category-item">
            <a href="HTML/생산현황emp.jsp" class="category-link">공정관리</a>
        </div>

        <div class="category-item">
            <a href="HTML/불량률파악보고서emp.jsp" class="category-link">불량률파악보고서</a>
        </div>
        <div class="category-item">
            <a href="HTML/마이페이지emp.jsp"><img class="mypage-icon" src="image/mypage.png"></a>
        </div>

    </div>
    <!-- 사이드바 -->

    <div class="_category">
        <a href="HTML/마이페이지.jsp">마이페이지</a> <br>
        <a href="HTML/계정관리.jsp">계정관리</a><br>
        <a href="HTML/사내게시판.jsp">사내게시판</a>
    </div>

    <!-- 내용페이지 -->
    <div class="content board">
        <h1><a href="HTML/사내게시판.jsp">사내게시판</a></h1>
        <table id="posts-table">
            <thead>
                <tr>
                    <td>번호</td>
                    <td>카테고리</td>
                    <td>제목</td>
                    <td>날짜</td>
                    <td>글쓴이</td>
                </tr>
            </thead>
            <tbody>
                <!-- 게시글 목록이 여기에 추가됩니다 -->
            </tbody>
        </table>
    </div>

    <div class="content2">
        <div id="content-display">
            <h1><a href="HTML/작업지시서(작업자용)emp.jsp">작업지시서 조회</a></h1>

            <div style="margin-left: 100px;">
                <div class="flex round page-item">
                    <div>
                        <a class="mho" href="HTML/작업지시서.jsp">2024-050</a>
                    </div>
                    <div>2024.07.18</div>
                    <div>2024.07.31</div>
                    <div class="over" title="고기만두">비비고/고기만두</div>
                    <div>2BOX</div>
                    <div>박경민</div>
                    <div>
                        <color class="green">작업중</color>
                    </div>
                </div>

                <div class="flex round page-item">
                    <div>
                        <a class="mho" href="HTML/작업지시서.jsp">2024-050</a>
                    </div>
                    <div>2024.07.18</div>
                    <div>2024.07.31</div>
                    <div class="over" title="고기만두">비비고/고기만두</div>
                    <div>2BOX</div>
                    <div>박경민</div>
                    <div>
                        <color class="green">작업중</color>
                    </div>
                </div>

                <div class="flex round page-item">
                    <div>
                        <a class="mho" href="HTML/작업지시서.jsp">2024-050</a>
                    </div>
                    <div>2024.06.18</div>
                    <div>2024.07.26</div>
                    <div class="over" title="김치만두">비비고/김치만두</div>
                    <div>20BOX</div>
                    <div>강희연</div>
                    <div>
                        <color class="red">작업예정</color>
                    </div>
                </div>
            </div>
        </div>

        <div class="progress">
            <h1><a href="HTML/생산현황.jsp">생산현황</a></h1>
            <div class="progress-explain">
                <span>1차 생산</span>
                <span>1차 검수</span>
                <span>2차 생산</span>
                <span>2차 검수</span>
                <span>포장</span>
                <span>3차 검수</span>
                <span>출하</span>
            </div>
            <div class="progress-container">
                <div class="progress-line-container">
                    <div class="progress-line"></div>
                    <div class="progress-line"></div>
                    <div class="progress-line"></div>
                    <div class="progress-line"></div>
                    <div class="progress-line"></div>
                    <div class="progress-line"></div>
                    <div class="progress-line"></div>
                </div>
                <div class="progress-bar"></div>
            </div>
            <div class="procount">
                <img src="image/갱신.png" class="pro-restart">
                <br>
                <span>생산 수량 | 20 BOX</span><br>
                <span>불량 수량 | 1 BOX</span>
            </div>
        </div>
    </div>

    <div class="content3">
        <div class="calendar-container">
            <div class="calendar-header">
                <button id="prev">◀</button>
                <h2 id="month-year"></h2>
                <button id="next">▶</button>
            </div>
            <div class="calendar">
                <div class="day-names">
                    <div>일</div>
                    <div>월</div>
                    <div>화</div>
                    <div>수</div>
                    <div>목</div>
                    <div>금</div>
                    <div>토</div>
                </div>
                <div id="days" class="days"></div>
            </div>
        </div>
    </div>

    <div class="content4">
        <div class="memo-container">
            <h2>메모 작성</h2>
            <textarea id="memo-input" rows="4" placeholder="메모를 작성하세요..."></textarea><br>
            <button id="add-memo">메모 추가</button>
        </div>

        <div class="memo-list">
            <h2>작성된 메모</h2>
            <ul id="memo-output">
                <!-- 메모 리스트가 여기에 추가됩니다 -->
            </ul>
        </div>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/4.4.0/chart.umd.min.js"></script>
    <script src="scriptemp.js"></script>

</body>

</html>
