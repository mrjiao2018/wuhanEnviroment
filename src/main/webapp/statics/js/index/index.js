//JavaScript代码区域
layui.use('element', function () {
    var element = layui.element;

    var form_data;
//加载网页前向服务器申请数据
    $(window).load(function () {
        var request_data = {
            year: 2011,
            position: "liangzilake",
            type: "forest"
        };
        //todo finish the url
        // var options = {
        //     url:"",
        //     data:JSON.stringify(request_data),
        //     dataType:"json",
        //     success:function (data) {
        //         form_data = data;
        //     }
        // };
        // $.ajax(options);
    });


    $(function () {


        //获取所有的form对象
        var calculatorArr = [];


        //获取所有form所在的div对象
        var calcDivArr = [];
        var $calculatorDivs = $(".calculator");
        var $specificCalcDivs = $calculatorDivs.children();
        for (var i = 0; i < $specificCalcDivs.length; ++i) {
            var $specificCalcDiv = $specificCalcDivs.eq(i);
            calcDivArr.push($specificCalcDiv);
            var $specificCalcForm = $specificCalcDiv.find("form").eq(0);
            calculatorArr.push($specificCalcForm);
        }


        //获取总表
        var $summarySheet = $(".summary-sheet").eq(0);


        //获取日期
        var year = $("#year").text();


        //todo 加载界面时，将所有数据加载到表单中
        //dataLoad(year, calculatorArr, $summarySheet);


        //在加载界面时，只展示第一个calcDiv，隐藏其余div及总表
        //showSingleDiv(calcDivArr, $summarySheet, 0);


        //左侧导航栏切换表单函数
        switchForm(calcDivArr, $summarySheet);


        //提交表单
        for (var k = 0; k < calculatorArr.length; ++k) {
            submitForm(calculatorArr[k]);
        }


        //更改日期时，重新加载data并刷新界面
        //dataReload(calculatorArr, $summarySheet);
    });


//表单提交函数
    function submitForm($form) {
        var $tds = $form.find("td");
        var options = {
            url: "/servlet/CalcServlet",
            type: "post",
            dataType: "json",
            beforeSubmit: function (formData, form) {
                console.log(formData);
                console.log(form);
                for (var i = 0; i < formData.length; ++i) {
                    $tds[i].innerHTML = formData[i].value;
                }
            },
            success: function (responseText) {
                console.log(responseText);
                $tds[$tds.length - 1].innerHTML = responseText.result;
            }
        };
        $form.ajaxForm(options)
    }


//只展示一个calcDiv，隐藏其余div及总表
    function showSingleDiv(calcDivArr, $summarySheet, index) {
        for (var j = 0; j < calcDivArr.length; ++j) {
            if (j == index) {
                calcDivArr[j].removeClass("hidden");
            }
            else {
                calcDivArr[j].addClass("hidden");
            }
        }
        if (index == calcDivArr.length) {
            $summarySheet.removeClass("hidden");
        }
        else {
            $summarySheet.addClass("hidden");
        }
    }


//左侧导航栏切换表单函数
    function switchForm(calcDivArr, $summarySheet) {
        var $side_navs = $(".side-nav");
        for (var i = 0; i < $side_navs.length; ++i) {
            $side_navs[i].index = i;
            $side_navs.eq(i).click(function () {
                showSingleDiv(calcDivArr, $summarySheet, this.index);
            });
        }
    }


//todo
    function showData(data, calculatorArr, $summarySheet) {

    }


//加载data数据并显示在form中
    function dataLoad(year, calculatorArr, $summarySheet) {
        var request_data = {
            year: year,
            position: "liangzilake",
            type: "forest"
        };
        var options = {
            url: "",
            data: JSON.stringify(request_data),
            dataType: "json",
            success: function (data) {
                showData(data, calculatorArr, $summarySheet);
                alert("年份切换成功");
            }
        };
        $.ajax(options);
    }


//更改日期表单重新加载函数
    function dataReload(calculatorArr, $summarySheet) {
        //更改日期的处理
        var $year_select = $("#year-select");
        var $year_options = $year_select.find("dd>a");
        var $year = $("#year");
        var year;
        //改变主界面中的日期显示
        for (var i = 0; i < $year_options.length; ++i) {
            $year_options.eq(i).click(function () {
                year = $(this).text();
                $year.text(year);
                // $year_select.find("#year-selected").text(year);
                //加载data数据并显示在form中
                dataLoad(year, calculatorArr, $summarySheet);
            });
        }
    }
});




