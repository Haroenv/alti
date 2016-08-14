var h = document.getElementById('height');
var d = document.getElementById('distance');

init();

Math.radians = function(degrees) {
  return degrees * Math.PI / 180;
};

function init() {
  if (window.DeviceOrientationEvent) {
    window.addEventListener('deviceorientation', function(eventData) {
      print(eventData.beta);
    }, false);
  } else {
    alert('your browser doesn\‘t support the DeviceOrientationEvent.\nTry this on a phone.');
  }
}

function print(angle) {
  document.getElementById("angle").innerHTML = Math.round(angle);
  h.innerHTML = Math.round(Math.tan(Math.radians(Math.round(angle))) * d.value * 10) / 10;
}

function save() {
  document.getElementById('saved').innerHTML = h.innerHTML;
}

document.getElementById('save').addEventListener('click',save());
