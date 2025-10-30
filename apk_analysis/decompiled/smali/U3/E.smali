.class public abstract LU3/E;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "([a-z])=\\s?(.+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LU3/E;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LU3/E;->b:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LU3/E;->c:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static a(Ljava/lang/String;)LU3/D;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-instance v2, LU3/C;

    .line 5
    .line 6
    invoke-direct {v2}, LU3/C;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v3, LU3/y;->h:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v3, LU3/y;->g:Ljava/lang/String;

    .line 19
    .line 20
    :goto_0
    sget v4, Ll4/y;->a:I

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    array-length v3, v0

    .line 28
    const/4 v5, 0x0

    .line 29
    move-object v8, v5

    .line 30
    const/4 v7, 0x0

    .line 31
    :goto_1
    iget-object v9, v2, LU3/C;->b:LP5/C;

    .line 32
    .line 33
    if-ge v7, v3, :cond_f

    .line 34
    .line 35
    aget-object v10, v0, v7

    .line 36
    .line 37
    const-string v11, ""

    .line 38
    .line 39
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v12

    .line 43
    if-eqz v12, :cond_1

    .line 44
    .line 45
    move v6, v4

    .line 46
    goto/16 :goto_9

    .line 47
    .line 48
    :cond_1
    sget-object v12, LU3/E;->a:Ljava/util/regex/Pattern;

    .line 49
    .line 50
    invoke-virtual {v12, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 51
    .line 52
    .line 53
    move-result-object v12

    .line 54
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    if-eqz v13, :cond_e

    .line 59
    .line 60
    invoke-virtual {v12, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const/4 v14, 0x2

    .line 68
    invoke-virtual {v12, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v15

    .line 79
    const/4 v6, 0x3

    .line 80
    const/4 v4, 0x4

    .line 81
    packed-switch v15, :pswitch_data_0

    .line 82
    .line 83
    .line 84
    :pswitch_0
    goto/16 :goto_2

    .line 85
    .line 86
    :pswitch_1
    const-string v15, "z"

    .line 87
    .line 88
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    if-eqz v13, :cond_2

    .line 93
    .line 94
    const/16 v13, 0xe

    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :pswitch_2
    const-string v15, "v"

    .line 99
    .line 100
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    if-eqz v13, :cond_2

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    goto/16 :goto_3

    .line 108
    .line 109
    :pswitch_3
    const-string v15, "u"

    .line 110
    .line 111
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-eqz v13, :cond_2

    .line 116
    .line 117
    move v13, v4

    .line 118
    goto/16 :goto_3

    .line 119
    .line 120
    :pswitch_4
    const-string v15, "t"

    .line 121
    .line 122
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    if-eqz v13, :cond_2

    .line 127
    .line 128
    const/16 v13, 0x9

    .line 129
    .line 130
    goto/16 :goto_3

    .line 131
    .line 132
    :pswitch_5
    const-string v15, "s"

    .line 133
    .line 134
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    if-eqz v13, :cond_2

    .line 139
    .line 140
    move v13, v14

    .line 141
    goto/16 :goto_3

    .line 142
    .line 143
    :pswitch_6
    const-string v15, "r"

    .line 144
    .line 145
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    if-eqz v13, :cond_2

    .line 150
    .line 151
    const/16 v13, 0xd

    .line 152
    .line 153
    goto/16 :goto_3

    .line 154
    .line 155
    :pswitch_7
    const-string v15, "p"

    .line 156
    .line 157
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    if-eqz v13, :cond_2

    .line 162
    .line 163
    const/4 v13, 0x6

    .line 164
    goto :goto_3

    .line 165
    :pswitch_8
    const-string v15, "o"

    .line 166
    .line 167
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v13

    .line 171
    if-eqz v13, :cond_2

    .line 172
    .line 173
    move v13, v1

    .line 174
    goto :goto_3

    .line 175
    :pswitch_9
    const-string v15, "m"

    .line 176
    .line 177
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    if-eqz v13, :cond_2

    .line 182
    .line 183
    const/16 v13, 0xc

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :pswitch_a
    const-string v15, "k"

    .line 187
    .line 188
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    if-eqz v13, :cond_2

    .line 193
    .line 194
    const/16 v13, 0xa

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :pswitch_b
    const-string v15, "i"

    .line 198
    .line 199
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v13

    .line 203
    if-eqz v13, :cond_2

    .line 204
    .line 205
    move v13, v6

    .line 206
    goto :goto_3

    .line 207
    :pswitch_c
    const-string v15, "e"

    .line 208
    .line 209
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v13

    .line 213
    if-eqz v13, :cond_2

    .line 214
    .line 215
    const/4 v13, 0x5

    .line 216
    goto :goto_3

    .line 217
    :pswitch_d
    const-string v15, "c"

    .line 218
    .line 219
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    if-eqz v13, :cond_2

    .line 224
    .line 225
    const/4 v13, 0x7

    .line 226
    goto :goto_3

    .line 227
    :pswitch_e
    const-string v15, "b"

    .line 228
    .line 229
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    if-eqz v13, :cond_2

    .line 234
    .line 235
    const/16 v13, 0x8

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :pswitch_f
    const-string v15, "a"

    .line 239
    .line 240
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v13

    .line 244
    if-eqz v13, :cond_2

    .line 245
    .line 246
    const/16 v13, 0xb

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_2
    :goto_2
    const/4 v13, -0x1

    .line 250
    :goto_3
    packed-switch v13, :pswitch_data_1

    .line 251
    .line 252
    .line 253
    goto :goto_6

    .line 254
    :pswitch_10
    if-eqz v8, :cond_3

    .line 255
    .line 256
    :try_start_0
    invoke-virtual {v8}, LU3/a;->a()LU3/c;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    invoke-virtual {v9, v8}, LP5/C;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :catch_0
    move-exception v0

    .line 265
    goto :goto_4

    .line 266
    :catch_1
    move-exception v0

    .line 267
    :goto_4
    invoke-static {v5, v0}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    throw v0

    .line 272
    :cond_3
    :goto_5
    sget-object v8, LU3/E;->c:Ljava/util/regex/Pattern;

    .line 273
    .line 274
    invoke-virtual {v8, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    const-string v10, "Malformed SDP media description line: "

    .line 283
    .line 284
    if-eqz v9, :cond_4

    .line 285
    .line 286
    invoke-virtual {v8, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v8, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v8, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v8, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    :try_start_1
    new-instance v8, LU3/a;

    .line 315
    .line 316
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 317
    .line 318
    .line 319
    move-result v11

    .line 320
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    invoke-direct {v8, v9, v11, v4, v6}, LU3/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_2

    .line 325
    .line 326
    .line 327
    :goto_6
    const/4 v6, -0x1

    .line 328
    goto/16 :goto_9

    .line 329
    .line 330
    :catch_2
    move-exception v0

    .line 331
    invoke-virtual {v10, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-static {v1, v0}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    throw v0

    .line 340
    :cond_4
    invoke-virtual {v10, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-static {v0, v5}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    throw v0

    .line 349
    :pswitch_11
    sget-object v4, LU3/E;->b:Ljava/util/regex/Pattern;

    .line 350
    .line 351
    invoke-virtual {v4, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 356
    .line 357
    .line 358
    move-result v6

    .line 359
    if-eqz v6, :cond_7

    .line 360
    .line 361
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v4, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    sget v9, LO5/i;->a:I

    .line 373
    .line 374
    if-nez v4, :cond_5

    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_5
    move-object v11, v4

    .line 378
    :goto_7
    if-nez v8, :cond_6

    .line 379
    .line 380
    iget-object v4, v2, LU3/C;->a:Ljava/util/HashMap;

    .line 381
    .line 382
    invoke-virtual {v4, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_6
    iget-object v4, v8, LU3/a;->i:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v4, Ljava/util/HashMap;

    .line 389
    .line 390
    invoke-virtual {v4, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    goto :goto_6

    .line 394
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    const-string v1, "Malformed Attribute line: "

    .line 397
    .line 398
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-static {v0, v5}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    throw v0

    .line 413
    :pswitch_12
    if-nez v8, :cond_8

    .line 414
    .line 415
    iput-object v12, v2, LU3/C;->i:Ljava/lang/String;

    .line 416
    .line 417
    goto :goto_6

    .line 418
    :cond_8
    iput-object v12, v8, LU3/a;->h:Ljava/lang/Object;

    .line 419
    .line 420
    goto :goto_6

    .line 421
    :pswitch_13
    iput-object v12, v2, LU3/C;->f:Ljava/lang/String;

    .line 422
    .line 423
    goto :goto_6

    .line 424
    :pswitch_14
    const-string v4, ":\\s?"

    .line 425
    .line 426
    const/4 v6, -0x1

    .line 427
    invoke-virtual {v12, v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    array-length v9, v4

    .line 432
    if-ne v9, v14, :cond_9

    .line 433
    .line 434
    move v9, v1

    .line 435
    goto :goto_8

    .line 436
    :cond_9
    const/4 v9, 0x0

    .line 437
    :goto_8
    invoke-static {v9}, Ll4/a;->h(Z)V

    .line 438
    .line 439
    .line 440
    aget-object v4, v4, v1

    .line 441
    .line 442
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    if-nez v8, :cond_a

    .line 447
    .line 448
    mul-int/lit16 v4, v4, 0x3e8

    .line 449
    .line 450
    iput v4, v2, LU3/C;->c:I

    .line 451
    .line 452
    goto :goto_9

    .line 453
    :cond_a
    mul-int/lit16 v4, v4, 0x3e8

    .line 454
    .line 455
    iput v4, v8, LU3/a;->c:I

    .line 456
    .line 457
    goto :goto_9

    .line 458
    :pswitch_15
    const/4 v6, -0x1

    .line 459
    if-nez v8, :cond_b

    .line 460
    .line 461
    iput-object v12, v2, LU3/C;->h:Ljava/lang/String;

    .line 462
    .line 463
    goto :goto_9

    .line 464
    :cond_b
    iput-object v12, v8, LU3/a;->g:Ljava/lang/Object;

    .line 465
    .line 466
    goto :goto_9

    .line 467
    :pswitch_16
    const/4 v6, -0x1

    .line 468
    iput-object v12, v2, LU3/C;->l:Ljava/lang/String;

    .line 469
    .line 470
    goto :goto_9

    .line 471
    :pswitch_17
    const/4 v6, -0x1

    .line 472
    iput-object v12, v2, LU3/C;->k:Ljava/lang/String;

    .line 473
    .line 474
    goto :goto_9

    .line 475
    :pswitch_18
    const/4 v6, -0x1

    .line 476
    invoke-static {v12}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    iput-object v4, v2, LU3/C;->g:Landroid/net/Uri;

    .line 481
    .line 482
    goto :goto_9

    .line 483
    :pswitch_19
    const/4 v6, -0x1

    .line 484
    if-nez v8, :cond_c

    .line 485
    .line 486
    iput-object v12, v2, LU3/C;->j:Ljava/lang/String;

    .line 487
    .line 488
    goto :goto_9

    .line 489
    :cond_c
    iput-object v12, v8, LU3/a;->f:Ljava/lang/Object;

    .line 490
    .line 491
    goto :goto_9

    .line 492
    :pswitch_1a
    const/4 v6, -0x1

    .line 493
    iput-object v12, v2, LU3/C;->d:Ljava/lang/String;

    .line 494
    .line 495
    goto :goto_9

    .line 496
    :pswitch_1b
    const/4 v6, -0x1

    .line 497
    iput-object v12, v2, LU3/C;->e:Ljava/lang/String;

    .line 498
    .line 499
    goto :goto_9

    .line 500
    :pswitch_1c
    const/4 v6, -0x1

    .line 501
    const-string v4, "0"

    .line 502
    .line 503
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-eqz v4, :cond_d

    .line 508
    .line 509
    :goto_9
    add-int/2addr v7, v1

    .line 510
    move v4, v6

    .line 511
    goto/16 :goto_1

    .line 512
    .line 513
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 514
    .line 515
    const-string v1, "SDP version "

    .line 516
    .line 517
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    const-string v1, " is not supported."

    .line 524
    .line 525
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-static {v0, v5}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    throw v0

    .line 537
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 538
    .line 539
    const-string v1, "Malformed SDP line: "

    .line 540
    .line 541
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-static {v0, v5}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    throw v0

    .line 556
    :cond_f
    if-eqz v8, :cond_10

    .line 557
    .line 558
    :try_start_2
    invoke-virtual {v8}, LU3/a;->a()LU3/c;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-virtual {v9, v0}, LP5/C;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3

    .line 563
    .line 564
    .line 565
    goto :goto_b

    .line 566
    :catch_3
    move-exception v0

    .line 567
    goto :goto_a

    .line 568
    :catch_4
    move-exception v0

    .line 569
    :goto_a
    invoke-static {v5, v0}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    throw v0

    .line 574
    :cond_10
    :goto_b
    :try_start_3
    new-instance v0, LU3/D;

    .line 575
    .line 576
    invoke-direct {v0, v2}, LU3/D;-><init>(LU3/C;)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_5

    .line 577
    .line 578
    .line 579
    return-object v0

    .line 580
    :catch_5
    move-exception v0

    .line 581
    goto :goto_c

    .line 582
    :catch_6
    move-exception v0

    .line 583
    :goto_c
    invoke-static {v5, v0}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    throw v0

    .line 588
    nop

    .line 589
    :pswitch_data_0
    .packed-switch 0x61
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method
