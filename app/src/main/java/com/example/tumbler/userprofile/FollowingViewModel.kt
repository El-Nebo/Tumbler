package com.example.tumbler.userprofile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tumbler.BaseApplication
import com.example.tumbler.model.entity.userprofile.Following
import com.example.tumbler.model.network.RemoteRepository
import kotlinx.coroutines.launch

class FollowingViewModel(private val remoteRepository: RemoteRepository):ViewModel() {
    private var _followingsMutalbleLiveData=MutableLiveData<List<Following>>()
    val followingLiveData:LiveData<List<Following>> get()=_followingsMutalbleLiveData


    fun getFollowings()=viewModelScope.launch{
        val following: List<Following> = remoteRepository.getFollowings(BaseApplication.user.access_token)
        _followingsMutalbleLiveData.postValue(following)
    }
}