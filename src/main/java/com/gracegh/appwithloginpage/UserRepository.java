package com.gracegh.appwithloginpage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Step 5: this is the third class I created...
@Repository
public interface UserRepository extends JpaRepository <User, Long>{

    User findByUsername(String username); //step 10:
}


