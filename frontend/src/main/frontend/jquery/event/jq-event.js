$(function () {
    let $d1 = $("#d1");

    let $evt = $.Event(new Event("build", function () {
        console.log(" new Event");
    }), {name: "jushisi", sex: "male"});


    console.log($evt);

    $d1.on("check1",function (e1,m1,m2) {
        alert(" check");

        console.log(e1)
        console.log(m1)
        console.log(m2)
    });


    $d1.trigger("check1",["mmmmm1","m2222"]);

});