##OnceClick

作为一个Android低端机用户，我经常会遇到这样一个问题：

在应用的使用过程中，因为低端机性能原因、Web页面性能问题，经常会导致点击按钮后程序卡顿，按钮点击事件延迟执行。造成的后果就是，卡顿后，继续多次点击非常容易导致事件多次执行，造成不可预知的Bug，且影响用户体验。

**OnceClick**的功能同它的名字一样：在一定时间内，按钮点击事件只能执行一次。未到指定时间，不执行点击事件。



###Usage

####Step 1

Install with gradle

    dependencies {
        compile 'com.github.zhaoxuan:once-click:0.1'
    }


####Step 2


View、Fragment、Activity 中初始化

	//建议在OnCreate中类似于ButterKnife的Bind方法。初始化OnceClick
   	OnceInit.once(this);
   	
or 

   	//设置间隔时间 3秒
   	OnceInit.once(this,3000);
   	

####Step 3

修饰某个点击事件方法

	@OnceClick(R.id.btn)
    public void once(){
    	text.setText("click"+num++);
    	Log.d("tag","once");
    }
    
 
###License

OnceClick is opensource, contribution and feedback are welcomed

Apache Version 2.0

Copyright 2015 Supercharge

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


###About me

#####[CSDN](http://blog.csdn.net/u010255127)



