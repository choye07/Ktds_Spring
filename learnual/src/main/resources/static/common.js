$(document).ready(function () {
  /* 대시보드 이벤트 start */
  // header 상단 메뉴버튼 클릭 시 sidebar 활성화
  $(".sidebar").hide();
  $(".btn-menu").on("click", function () {
    $(".sidebar").stop().show().addClass("on");
  });

  // sidebar close버튼 클릭시 sidebar 비활성화
  $(".btn-close").on("click", function () {
    $(".sidebar").stop().removeClass("on");
  });

  // sidebar menu accordion
  $(".sidebar-main-menu").on("click", function () {
    $(this).closest(".sidebar-menu").find(".menu-list").stop().slideToggle();
  });

  // header 상단 알림버튼 클릭 시 알림박스 활성화 (toggle)
  $(".btn-notification").on("click", function () {
    $(".notification-box").toggleClass("on");
  });

  /* 대시보드 이벤트 end */
  // ========================================================
  /* 강좌 생성 이벤트 start */

  // 모달 레이어 강좌 추가
  $(".modal").hide();
  $(".btn-add-course").on("click", function () {
    $(".modal").fadeIn();
  });
  $(".btn-cancel").on("click", function () {
    $(".modal").fadeOut();
  });

  // 강좌 생성 제어
  const selectedSubjects = new Set(); // 선택된 과목을 저장할 Set

  $("#course-subject").change(function () {
    const selectedOptions = $(this).val(); // 선택된 옵션의 값 배열

    // 선택된 과목을 Set에 추가
    selectedOptions.forEach((subject) => selectedSubjects.add(subject));

    // 선택된 과목을 표시
    $("#selected-subject-box").empty(); // 기존 표시 초기화
    selectedSubjects.forEach((subject) => {
      $("#selected-subject-box").append(`
              <div class="subject-item" data-subject="${subject}">
                  ${subject}
                  <span class="remove-button">x</span>
              </div>
          `);
    });

    updateHiddenInput(); // 숨겨진 입력 필드 업데이트
  });

  // 선택된 과목 삭제
  $("#selected-subject-box").on("click", ".remove-button", function () {
    const subject = $(this).parent(".subject-item").data("subject");
    selectedSubjects.delete(subject); // Set에서 과목 제거
    $(this).parent(".subject-item").remove(); // 표시에서 제거
    updateHiddenInput(); // 숨겨진 입력 필드 업데이트
  });

  // 숨겨진 입력 필드 업데이트 함수
  function updateHiddenInput() {
    $("#selected-subjects-input").val(Array.from(selectedSubjects).join(",")); // 선택된 과목을 쉼표로 구분하여 저장
  }

  // // // 폼 제출 이벤트
  // $("#course-create-form").submit(function (event) {
  //   // event.preventDefault(); // 기본 제출 방지

  //   alert(
  //     "강좌가 성공적으로 등록되었습니다!" +
  //       "(과목명: " +
  //       Array.from(selectedSubjects) +
  //       ")"
  //   );

  //   // 실제 폼 제출 (AJAX 또는 기본 제출)
  //   // $(this).unbind("submit").submit(); // 기본 제출
  //   // 또는 AJAX를 사용하여 전송
  //   // $.post('/your-endpoint', $(this).serialize());
  // });

  /* 강좌 생성 이벤트 end */
});
