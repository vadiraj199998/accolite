***********************READ ME**********************************************
******************Implementation**********************************************
---->The thread for adding the passangers is created by running the thread t1.start();
---->Upon running the thread the passangers gets allocated to the 5 Taxies in the taxi stand which are created by constructor of taxistand 
	class.
-----> after thread t1 is executed,it is made to go to waiting state.
----->the taxistand queue is processed.The filled taxies and the taxies with atleast one passanger and time >5 seconds elapsed in taxi stand
	are removed.
----->the new taxies are runned into taxi stand and notifies all other threads.
----->the passanger queue is processed.
----->the status is displayed.

