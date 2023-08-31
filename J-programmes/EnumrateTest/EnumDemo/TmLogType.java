/**
     * 0领取、1预约、2签到、3入场、4称皮、5称毛、6离场、7入磅房、8出磅房、9入煤仓、10出煤仓
     */
 public  enum TmLogType {
        
		//括号内的数值代号可以通过getVal()获取
		领取(0),预约(1),签到(2),入场(3),称皮(4),称毛(5),离场(6),
        入磅房(7),出磅房(8),入煤仓(9),出煤仓(10),放空(11),作废(12);
        
		private int val;
        
		TmLogType(int val){
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }