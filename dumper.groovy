from('knative:endpoint/dumper')
  .log('${body}')
  .removeHeaders('*')
