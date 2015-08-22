var h = document.getElementById('height');
var d = document.getElementById('distance');
init();

Math.radians = function(degrees) {
  return degrees * Math.PI / 180;
};

function init() {
  if (window.DeviceOrientationEvent) {
    window.addEventListener('deviceorientation', function(eventData) {
      var alpha = eventData.beta;
      print(alpha);
    }, false);
  } else {
    document.getElementById("fail").style.display = "inline";
  }
}

function print(alpha) {
  document.getElementById("angle").innerHTML = Math.round(alpha);
  h.innerHTML = Math.round(Math.tan(Math.radians(Math.round(alpha))) * d.value * 10) / 10;
}
