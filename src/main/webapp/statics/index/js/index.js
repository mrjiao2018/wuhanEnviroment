$(function () {
    //获取所有的form对象
    var calculatorArr = [];
    //获取所有form所在的div对象
    var calcDivArr = [];
    var $calculatorDivs = $(".calculator");
    var $specificCalcDivs = $calculatorDivs.children();
    for(var i = 0; i < $specificCalcDivs.length; ++i) {
        var $specificCalcDiv = $specificCalcDivs.eq(i);
        calcDivArr.push($specificCalcDiv);
        var $specificCalcForm = $specificCalcDiv.find("form").eq(0);
        calculatorArr.push($specificCalcForm);
    }

    //获取总表
    var $summarySheet = $(".summary-sheet").eq(0);

    //在加载界面时，只展示第一个calcDiv，隐藏其余div及总表
    //showSingleDiv(calcDivArr, $summarySheet);

    //左侧导航栏切换表单函数
    switchForm();

    //提交表单
    for(var k = 0; k < calculatorArr.length; ++k) {
        submitForm(calculatorArr[k]);
    }
});

//表单提交函数
function submitForm($form) {
    var $tds = $form.find("td");
    var options = {
        url: "/test",
        type: "post",
        dataType: "json",
        beforeSubmit: function(formData) {
            for(var i=0; i<formData.length-1; ++i) {
                $tds[i].innerHTML = formData[i].value;
            }
        },
        success: function(responseText) {
            $tds[$tds.length-1].innerHTML = responseText.result;
        }
    };
    $form.ajaxForm(options)
}

//在加载界面时，只展示第一个calcDiv，隐藏其余div及总表
function showSingleDiv(calcDivArr, $summarySheet) {
    for(var j = 1; j < calcDivArr.length; ++j) {
        calcDivArr[j].addClass("hidden");
    }
    $summarySheet.addClass("hidden");
}

//左侧导航栏切换表单函数
function switchForm() {

}



