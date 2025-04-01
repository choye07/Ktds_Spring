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
});
