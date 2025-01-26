package com.demo.testapplication.exception;

import java.util.Date;

public class ErrorResponse extends RuntimeException{
     private Date timestamp;
        private String msg;
        private int status;

        public ErrorResponse(Date timestamp, String msg, int status){
            this.timestamp = timestamp;
            this.msg = msg;
            this.status = status;
        }
        public Date getTimestamp(){
            return timestamp;
        }
        @Override
        public String getMessage(){
            return msg;
        }
        public int getStatus(){
            return status;
        }
}
