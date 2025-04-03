$().ready(function () {
  $("form.write-form")
    .find(".write-save")
    .on("click", function (event) {
      var invalidInputs = $("input:invalid, textarea:invalid");
      if (invalidInputs.length > 0) {
        return;
      }
      $("form.write-form")
        .attr({
          // 객체 리터럴 타입
          method: "POST",
          action: "/board/write",
        })
        .submit();
    });
  $("form.update-form")
    .find(".update-button")
    .on("click", function () {
      var invalidInputs = $("input:invalid, textarea:invalid");
      // var id = $("form.update-form").find("input[type='hidden'][name='id']").val();
      // console.log(id);
      // alert(id);
      if (invalidInputs.length > 0) {
        return;
      }
      $("form.update-form")
        .attr({
          // 객체 리터럴 타입
          method: "POST",
          action: "/baord/modify",
        })
        .submit();
    });
    
    //회원 가입 이벤트
    $(".member-regist-form").find(".cancel-button")
    .on("click", function () {
        history.back();
    });

    $(".member-regist-form").find(".regist-button")
    .on("click", function () {
        $(".member-regist-form").attr({
            method: "POST",
            action: "/member/regist"
        }).submit();
    });
});
