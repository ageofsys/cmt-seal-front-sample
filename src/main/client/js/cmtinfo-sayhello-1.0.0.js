import $ from "jquery";

export default sayHello;

const sayHello = function () {
    const arr = [1, 2, 3].map(n => n ** 2);
    alert("Hello " + arr[1]);
};

$(document).ready(function() {
    $("[data-sayhello]").on("click", sayHello);
});
