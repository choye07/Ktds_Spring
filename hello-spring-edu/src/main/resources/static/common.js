$().ready(function() {
    $("form.write-form")
        .find(".write-save")
        .on("click", function(event) {
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
        .on("click", function() {
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
        .on("click", function() {
            history.back();
        });

    $(".member-regist-form").find(".regist-button")
        .on("click", function() {
            $(".member-regist-form").attr({
                method: "POST",
                action: "/member/regist"
            }).submit();
        });
    // 회원가입 비밀번호 패턴 체크
    $(".member-regist-wrapper").find("#password, #confirmPassword")
        .on("keyup", function() {
            // 대문자, 소문자, 숫자, 특수기호 포함해서 10자리 이상.
            var passwordRegExr = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z])(?=.*\W).{10,}$/;
            var value = $(this).val();

            // 패스워드가 정규표현식의 패턴과 일치하는지 검사.
            var match = passwordRegExr.test(value);

            if (!match) {
                var existsPasswordPatternError = $(this).closest("div").find(".passwordPatternError");
                if (existsPasswordPatternError.length == 0) {
                    var message = "비밀번호는 영소문자, 대문자, 숫자, 특수문자를 포함해 10자리 이상으로 입력해야 합니다.";
                    var errorDom = $("<div></div>");
                    errorDom.text(message);
                    errorDom.addClass("error");
                    errorDom.addClass("passwordPatternError");

                    $(this).after(errorDom);
                }
            }
            else {
                var isErrorDom = $(this).closest("div").find(".passwordPatternError");
                if (isErrorDom) {
                    $(this).closest("div").find(".passwordPatternError").remove();
                }
            }

            // 패스워드 일치검사.
            var password = $(".member-regist-wrapper").find("#password").val();
            var confirmPassword = $(".member-regist-wrapper").find("#confirmPassword").val();

            if (password != confirmPassword) {
                var isPasswordEqualError = $(".member-regist-wrapper").find("#password")
                    .closest("div").find(".passwordEqualError");
                var isConfirmPasswordEqualError = $(".member-regist-wrapper").find("#confirmPassword")
                    .closest("div").find(".passwordEqualError");

                if (isPasswordEqualError.length > 0 && isConfirmPasswordEqualError.length > 0) {
                    return;
                }

                var passwordEqualErrorMessage = "비밀번호가 일치하지 않습니다.";
                var passwordEqualErrorDom = $("<div></div>");
                passwordEqualErrorDom.text(passwordEqualErrorMessage);
                passwordEqualErrorDom.addClass("error");
                passwordEqualErrorDom.addClass("passwordEqualError");

                var confirmPasswordEqualErrorDom = $("<div></div>");
                confirmPasswordEqualErrorDom.text(passwordEqualErrorMessage);
                confirmPasswordEqualErrorDom.addClass("error");
                confirmPasswordEqualErrorDom.addClass("passwordEqualError");

                $(".member-regist-wrapper").find("#password").after(passwordEqualErrorDom);
                $(".member-regist-wrapper").find("#confirmPassword").after(confirmPasswordEqualErrorDom);
            }
            else {
                $(".member-regist-wrapper").find("#password").closest("div").find(".passwordEqualError").remove();
                $(".member-regist-wrapper").find("#confirmPassword").closest("div").find(".passwordEqualError").remove();
            }
        });
    //회원가입 이메일 중복 체크 이벤트
    $(".member-regist-wrapper").find("#email")
        .on("blur", function() {
            var emailValue = $(this).val();
            var that = this;//자바 스크립트의 this는 function을 호출한 아이. $()
            //그래서 먼저 정의를 내려주고 ajax에서 email을 가리킬 수 있도록 한다.
            $.get("/member/available", {
                "email": emailValue
            }, function(ajaxResponse) {

                /**
                 * {
                     "status": 200,
                     "data": {
                         "available": true
                     }
                 }
                 */

                if (ajaxResponse.status == 200 &&
                    ajaxResponse.data.available) {
                    //사용할 수 있는 이메일.
                    $(that).closest("div").find(".emailDuplicateError").remove();

                } else {
                    if ($(that).closest("div").find(".emailDuplicateError").length > 0) {
                        return;
                    }
                    //사용할 수 없는 이메일.
                    var emailErrorDom = $("<div></div>");
                    emailErrorDom.text("이미 사용중인 이메일입니다. 다른 이메일을 입력해주세요.");
                    emailErrorDom.addClass("error");
                    emailErrorDom.addClass("emailDuplicateError");
                    $(that).after(emailErrorDom);
                }
            });
        });

    $(".member-regist-wrapper").find("input")
        .on("change", function() {
            var hasErrors = $(".member-regist-wrapper").find(".error").length > 0;
            hasErrors = hasErrors || $("input:invalid").length > 0;
            if (hasErrors) {
                $(".member-regist-wrapper").find(".regist-button").attr("diabled", "disabled");
            } else {
                $(".member-regist-wrapper").find(".regist-button").removeAttr("disabled");
            }
        });
});
