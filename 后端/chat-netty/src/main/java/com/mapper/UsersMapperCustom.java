package com.mapper;

import java.util.List;

import com.pojo.Users;
import com.pojo.vo.FriendRequestVO;
import com.pojo.vo.MyFriendsVO;
import com.utils.MyMapper;

public interface UsersMapperCustom extends MyMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
	
	public List<MyFriendsVO> queryMyFriends(String userId);
	
	public void batchUpdateMsgSigned(List<String> msgIdList);
	
}