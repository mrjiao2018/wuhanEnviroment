$(function () {
    //获取所有的form对象
    //water
    var water_1_calculator_form = $(".water-1-calculator:first form:first");
    var water_2_calculator_form = $(".water-2-calculator:first form:first");
    var water_3_calculator_form = $(".water-3-calculator:first form:first");
    //soil
    var soil_1_calculator_form = $(".soil-1-calculator:first form:first");
    var soil_2_calculator_form = $(".soil-2-calculator:first form:first");
    var soil_3_calculator_form = $(".soil-3-calculator:first form:first");
    var soil_4_calculator_form = $(".soil-4-calculator:first form:first");
    var soil_5_calculator_form = $(".soil-5-calculator:first form:first");
    var soil_6_calculator_form = $(".soil-6-calculator:first form:first");
    //carbon
    var carbon_1_calculator_form = $(".carbon-1-calculator:first form:first");
    var carbon_2_calculator_form = $(".carbon-2-calculator:first form:first");
    var carbon_3_calculator_form = $(".carbon-3-calculator:first form:first");
    //oxygen
    var oxygen_1_calculator_form = $(".oxygen-1-calculator:first form:first");
    var oxygen_2_calculator_form = $(".oxygen-2-calculator:first form:first");
    //nutriment
    var nutriment_1_calculator_form = $(".nutriment-1-calculator:first form:first");
    var nutriment_2_calculator_form = $(".nutriment-2-calculator:first form:first");
    var nutriment_3_calculator_form = $(".nutriment-3-calculator:first form:first");
    var nutriment_4_calculator_form = $(".nutriment-4-calculator:first form:first");
    //ion
    var ion_1_calculator_form = $(".ion-1-calculator:first form:first");
    //pollution
    var pollution_1_calculator_form = $(".pollution-1-calculator:first form:first");
    var pollution_2_calculator_form = $(".pollution-2-calculator:first form:first");
    var pollution_3_calculator_form = $(".pollution-3-calculator:first form:first");
    var pollution_4_calculator_form = $(".pollution-4-calculator:first form:first");
    var pollution_5_calculator_form = $(".pollution-5-calculator:first form:first");

    submitForm(water_1_calculator_form);
});

//表单提交函数
function submitForm(form) {
    var options = {
        url: "/test",
        type: "post",
        dataType: "json",
        success: function(responseText) {
            console.log(responseText);
        }
    };
    form.ajaxForm(options)
}



