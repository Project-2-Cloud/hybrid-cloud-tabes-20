

<template>
   <header class="masthead">
    <div class="container h-100">
      <div class="row h-100">
        <div class="col-lg-7 my-auto">
          <div class="header-content mx-auto">
            <h1 class="mb-5">BESTUDY </h1>
            <p>is an online education platform that motivates and helps students. Bestudy gives you the opportunity to study together with others as well as the possibility to hire teachers to help you mastering your course.   </p>
            <a href="#download" class="btn btn-outline btn-xl js-scroll-trigger">Start studying now!</a>
          </div>
        </div>
        <div class="col-lg-5 my-auto">
          <div class="device-container">
            <div class="device-mockup iphone6_plus portrait white">
              <div class="device">
                <div class="screen imagecontainer" >
                  <!-- Demo image for screen mockup, you can put an image here, some HTML, an animation, video, or anything else! -->
                  <img src="../assets/study.jpg" class="img-fluid" alt="">
                </div>
                <div class="button">
                  <!-- You can hook the "home button" to some JavaScript events or just remove it -->
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <section class="download bg-primary text-center" id="download">
    <div class="container">
      <div class="row">
        <div class="col-md-8 mx-auto">
          <h2 class="section-heading">Study together</h2>
          <p>Join a virtual room and study online with other students</p>
          <div class="badges">
            <a class="badge-link" href="#"><img src="img/google-play-badge.svg" alt=""></a>
            <a class="badge-link" href="#"><img src="img/app-store-badge.svg" alt=""></a>
          </div>
        </div>
      </div>
    </div>
  </section>
  </header>
   
</template>
	
// <script>
// // @ is an alias to /src
// import Item from "@/Item.vue"	
// export default {
//   name: 'Home',
//   computed: {
//     teachers() {
//       return this.$store.state.teachers;
//     }
//   },
//   components: {
//     Item
//   }
// }
// </script>

<style scoped>

.imagecontainer {
  top: 40% !important; 
  left: -20%  !important;
  right: -10% !important;
}

</style>