package com.example.chatappclone.Model

class Story
{
    private var imageurl:String=""
    private var timestart:Long=0
    private var timeend:Long=0
    private var storyid:String=""
    private var userid :String=""

    constructor()
    constructor(imageurl: String, timestart: Long, timeend: Long, storyid: String, userid: String) {
        this.imageurl = imageurl
        this.timestart = timestart
        this.timeend = timeend
        this.storyid = storyid
        this.userid = userid
    }

    fun getImageUrl():String{
        return imageurl
    }

    fun getTimeStart():Long{
        return timestart
    }

    fun getTimeeEnd():Long{
        return timeend
    }

    fun getStoryId():String{
        return storyid
    }

    fun getUserId():String{
        return userid
    }

    fun setImageUrl(userid: String){
        this.userid=userid
    }

    fun setTimeStart(timestart: Long){
        this.timestart=timestart
    }

    fun setTimeeEnd(timeend: Long){
        this.timeend=timeend
    }

    fun setStoryId(storyid: String){
        this.storyid=storyid
    }

    fun setUserId(userid: String){
        this.userid=userid
    }



}