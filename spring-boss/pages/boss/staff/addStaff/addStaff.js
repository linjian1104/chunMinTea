// pages/boss/staff/addStaff/addStaff.js
//原始地址
// const STAFF_URL = 'http://localhost:8081/add';
//分布式搭建后地址
const STAFF_URL = 'http://localhost:8081/joinuser/user/add'
// const STAFF_URL = 'http://localhost:9000/invoking/user/add'
Page({

    /**
     * 页面的初始数据
     */
    data: {
      name: '',
      six: '',
      age:'',
      telephone: '',
      cardId: '',
      joinDate: '',
      password:''
    },
    // name_input: function (e){
    //   this.setData({
    //     name: e.detail.value
    //   })
    // },
    // six_input: function (e) {
    //   this.setData({
    //     six: e.detail.value
    //   })
    // },
    // age_input: function (e) {
    //   this.setData({
    //     age: e.detail.value
    //   })
    // },
    // telephone_input: function (e) {
    //   this.setData({
    //     telephone: e.detail.value
    //   })
    // },
    // cardId_input: function (e) {
    //   this.setData({
    //     cardId: e.detail.value
    //   })
    // },
    // joinDate_input: function (e) {
    //   this.setData({
    //     joinDate: e.detail.value
    //   })
    // },
    // confirm_add: function(){
    //   console.info(this.data)
    //   if(this.data.name.length == 0){
    //     this.setData({
    //       infoMess:'名字不能为空'
    //     })
    //   }
    // },
    /**
     * 
     * 
     */
    getForm: function (e){
      var formdata = e.detail.value;
      this.setData({
      "data.name": formdata.name,
      "data.six": formdata.six,
      "data.age": formdata.age,
      "data.telephone": formdata.telephone,
      "data.cardId": formdata.cardId,
      "data.joinDate": formdata.joinDate,
      "data.password": formdata.password
      })
      console.log("更新data",e)
    },
    confirm_add: function (){
      var getdata = this.data;
      wx.request({
        url: STAFF_URL,
        method: 'POST',
        header: {
          "Content-Type": "application/x-www-form-urlencoded"
        },
        // data:{
        //   name:"songmingjie",
        //   six:"sdf"
        // },
        data: {
          name: getdata.data.name,
          six: getdata.data.six,
          age: getdata.data.age,
          telephone: getdata.data.telephone,
          cardId: getdata.data.cardId,
          joinDate: getdata.data.joinDate,
          password: getdata.data.password
        },
        success: (data) => {
          console.log(data)
          data.data == "success" ? console.log("添加成功") : console.log("添加失败");
        },
        fail: function(){
          console.log("接口访问失败")
        }
      })
      wx.redirectTo({
        url: '../staff',
      })
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {

    },

    /**
     * 生命周期函数--监听页面初次渲染完成
     */
    onReady: function () {

    },

    /**
     * 生命周期函数--监听页面显示
     */
    onShow: function () {

    },

    /**
     * 生命周期函数--监听页面隐藏
     */
    onHide: function () {

    },

    /**
     * 生命周期函数--监听页面卸载
     */
    onUnload: function () {

    },

    /**
     * 页面相关事件处理函数--监听用户下拉动作
     */
    onPullDownRefresh: function () {

    },

    /**
     * 页面上拉触底事件的处理函数
     */
    onReachBottom: function () {

    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage: function () {

    }
})