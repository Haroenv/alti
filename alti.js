var h = document.getElementById('height');
var d = document.getElementById('distance');
init();

function init() {
  if (window.DeviceOrientationEvent) {
    window.addEventListener('deviceorientation', function(eventData) {
      var alpha = eventData.beta;
      window.setTimeout(deviceOrientationHandler(alpha), 1000);
    }, false);
  } else {
    document.getElementById("fail").style.display = "inline";
  }
}

function deviceOrientationHandler(alpha) {
  document.getElementById("angle").innerHTML = Math.round(alpha);
  h.innerHTML = Math.round(Math.tan(alpha) * d.value * 10) / 10;
}
