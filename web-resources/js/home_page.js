/* Set the width of the side navigation to 250px */
/**
 * @global posts
 * 
 * 
 *
 * Fields:
 *  
 */

  
  /* Set the width of the side navigation to 250px */
  function openNav() {
      document.getElementById("mySidenav").style.width = "250px";
    }
    
  function closeNav() {
      document.getElementById("mySidenav").style.width = "0";
    }
  
  function signIn() {
    if (document.getElementById("signin") == True) {
      //
    }
    //open modal for sign in
  }
  
  function search() {
    document.getElementById("myDropdown").classList.toggle("show");
  }
  function filterFunction(){
    var input, filter, ul, li, a, i;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    div = document.getElementById("myDropdown");
    a = div.getElementsByTagName("a");
    for (i = 0; i < a.length; i++) {
      txtValue = a[i].textContent || a[i].innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        a[i].style.display = "";
      } else {
        a[i].style.display = "none";
      }
    }
  }