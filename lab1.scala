val spark = SparkSession.builder.appName("lab01").master("local(*)").getOrCreate()

val df = spark.read.format("csv").option("inferschema",true).load("/home/hduser/hive/data/txns").toDF

df.show()

df.printSchema()
