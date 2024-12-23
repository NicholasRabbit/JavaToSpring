public class StreamListToMap {

	public static void main(String[] args){
	
		//把list转换为map
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L,"Tom",65));
        userList.add(new User(2L,"Jerry",77));
        userList.add(new User(3L,"Ken",83));

        Map<Long, String> stringMap = userList.stream().collect(Collectors.toMap(User::getId, User::getName));
        Set<Long> longs = stringMap.keySet();
        Collection<String> values = stringMap.values();
        System.out.println( "longs==>" + longs);
        System.out.println("values==>" + values);


	}
}