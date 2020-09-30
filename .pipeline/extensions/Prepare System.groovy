void call(Map params) {
  //access stage name
  echo "Start - Extension for stage: ${params.stageName}"

  //access config
  echo "Current stage config: ${params.config}"

cloudFoundryCreateService script: params.script
sleep(time: 2, unit: "HOURS")
cloudFoundryCreateServiceKey script: params.script

  echo "End - Extension for stage: ${params.stageName}"
}
return this
