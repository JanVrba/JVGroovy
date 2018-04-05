API_FAILED = 25
API_PASSED = 75
API_TOTAL = 100
threshold = (API_FAILED/API_TOTAL) * 100
echo "Threshold is : " + threshold + " %"
       
       if (threshold > 50) {
           echo "Threshold is more than 50%, current value: " + threshold + " %"
           currentBuild.result = "FAILURE"
           echo currentBuild.result
           
       } else {
           echo "Threshold is less than 50%, current value: " + threshold + " %"
           currentBuild.result = "SUCCESS"
           echo currentBuild.result
       }
