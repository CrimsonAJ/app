.class public final Landroidx/datastore/preferences/protobuf/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/D;


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/k0;Landroidx/datastore/preferences/protobuf/m0;La0/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/datastore/preferences/protobuf/D;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/D;-><init>(Landroidx/datastore/preferences/protobuf/k0;Landroidx/datastore/preferences/protobuf/m0;La0/g;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/E;->a:Landroidx/datastore/preferences/protobuf/D;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method

.method public static a(Landroidx/datastore/preferences/protobuf/D;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    sget v5, Landroidx/datastore/preferences/protobuf/o;->c:I

    .line 10
    .line 11
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->L(I)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    sget-object v6, Landroidx/datastore/preferences/protobuf/o0;->d:Landroidx/datastore/preferences/protobuf/l0;

    .line 16
    .line 17
    iget-object v7, v0, Landroidx/datastore/preferences/protobuf/D;->a:Landroidx/datastore/preferences/protobuf/k0;

    .line 18
    .line 19
    if-ne v7, v6, :cond_0

    .line 20
    .line 21
    mul-int/2addr v5, v3

    .line 22
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    const/16 v8, 0x3f

    .line 27
    .line 28
    const-string v9, "There is no way to get here, but the compiler thinks otherwise."

    .line 29
    .line 30
    const/16 v10, 0x8

    .line 31
    .line 32
    const/4 v11, 0x4

    .line 33
    const/4 v12, 0x0

    .line 34
    packed-switch v7, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    new-instance v0, Ljava/lang/RuntimeException;

    .line 38
    .line 39
    invoke-direct {v0, v9}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :pswitch_0
    check-cast v1, Ljava/lang/Long;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v13

    .line 49
    shl-long v15, v13, v4

    .line 50
    .line 51
    shr-long/2addr v13, v8

    .line 52
    xor-long/2addr v13, v15

    .line 53
    invoke-static {v13, v14}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :pswitch_1
    check-cast v1, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    shl-int/lit8 v7, v1, 0x1

    .line 66
    .line 67
    shr-int/lit8 v1, v1, 0x1f

    .line 68
    .line 69
    xor-int/2addr v1, v7

    .line 70
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :pswitch_2
    check-cast v1, Ljava/lang/Long;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    :goto_0
    move v1, v10

    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :pswitch_3
    check-cast v1, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    :goto_1
    move v1, v11

    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :pswitch_4
    check-cast v1, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    int-to-long v13, v1

    .line 99
    invoke-static {v13, v14}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    goto/16 :goto_3

    .line 104
    .line 105
    :pswitch_5
    check-cast v1, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :pswitch_6
    instance-of v7, v1, Landroidx/datastore/preferences/protobuf/g;

    .line 118
    .line 119
    if-eqz v7, :cond_1

    .line 120
    .line 121
    check-cast v1, Landroidx/datastore/preferences/protobuf/g;

    .line 122
    .line 123
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    :goto_2
    add-int/2addr v1, v7

    .line 132
    goto/16 :goto_3

    .line 133
    .line 134
    :cond_1
    check-cast v1, [B

    .line 135
    .line 136
    array-length v1, v1

    .line 137
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    goto :goto_2

    .line 142
    :pswitch_7
    check-cast v1, Landroidx/datastore/preferences/protobuf/a;

    .line 143
    .line 144
    check-cast v1, Landroidx/datastore/preferences/protobuf/t;

    .line 145
    .line 146
    invoke-virtual {v1, v12}, Landroidx/datastore/preferences/protobuf/t;->a(Landroidx/datastore/preferences/protobuf/T;)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    goto :goto_2

    .line 155
    :pswitch_8
    check-cast v1, Landroidx/datastore/preferences/protobuf/a;

    .line 156
    .line 157
    check-cast v1, Landroidx/datastore/preferences/protobuf/t;

    .line 158
    .line 159
    invoke-virtual {v1, v12}, Landroidx/datastore/preferences/protobuf/t;->a(Landroidx/datastore/preferences/protobuf/T;)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    goto :goto_3

    .line 164
    :pswitch_9
    instance-of v7, v1, Landroidx/datastore/preferences/protobuf/g;

    .line 165
    .line 166
    if-eqz v7, :cond_2

    .line 167
    .line 168
    check-cast v1, Landroidx/datastore/preferences/protobuf/g;

    .line 169
    .line 170
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    goto :goto_2

    .line 179
    :cond_2
    check-cast v1, Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->K(Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    goto :goto_3

    .line 186
    :pswitch_a
    check-cast v1, Ljava/lang/Boolean;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move v1, v4

    .line 192
    goto :goto_3

    .line 193
    :pswitch_b
    check-cast v1, Ljava/lang/Integer;

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :pswitch_c
    check-cast v1, Ljava/lang/Long;

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    goto :goto_0

    .line 205
    :pswitch_d
    check-cast v1, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    int-to-long v13, v1

    .line 212
    invoke-static {v13, v14}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    goto :goto_3

    .line 217
    :pswitch_e
    check-cast v1, Ljava/lang/Long;

    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 220
    .line 221
    .line 222
    move-result-wide v13

    .line 223
    invoke-static {v13, v14}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    goto :goto_3

    .line 228
    :pswitch_f
    check-cast v1, Ljava/lang/Long;

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 231
    .line 232
    .line 233
    move-result-wide v13

    .line 234
    invoke-static {v13, v14}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    goto :goto_3

    .line 239
    :pswitch_10
    check-cast v1, Ljava/lang/Float;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    goto/16 :goto_1

    .line 245
    .line 246
    :pswitch_11
    check-cast v1, Ljava/lang/Double;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :goto_3
    add-int/2addr v1, v5

    .line 254
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/j;->L(I)I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    iget-object v0, v0, Landroidx/datastore/preferences/protobuf/D;->b:Landroidx/datastore/preferences/protobuf/m0;

    .line 259
    .line 260
    if-ne v0, v6, :cond_3

    .line 261
    .line 262
    mul-int/2addr v5, v3

    .line 263
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    packed-switch v0, :pswitch_data_1

    .line 268
    .line 269
    .line 270
    new-instance v0, Ljava/lang/RuntimeException;

    .line 271
    .line 272
    invoke-direct {v0, v9}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v0

    .line 276
    :pswitch_12
    move-object v0, v2

    .line 277
    check-cast v0, Ljava/lang/Long;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 280
    .line 281
    .line 282
    move-result-wide v2

    .line 283
    shl-long v6, v2, v4

    .line 284
    .line 285
    shr-long/2addr v2, v8

    .line 286
    xor-long/2addr v2, v6

    .line 287
    invoke-static {v2, v3}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    goto/16 :goto_7

    .line 292
    .line 293
    :pswitch_13
    move-object v0, v2

    .line 294
    check-cast v0, Ljava/lang/Integer;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    shl-int/lit8 v2, v0, 0x1

    .line 301
    .line 302
    shr-int/lit8 v0, v0, 0x1f

    .line 303
    .line 304
    xor-int/2addr v0, v2

    .line 305
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    goto/16 :goto_7

    .line 310
    .line 311
    :pswitch_14
    move-object v0, v2

    .line 312
    check-cast v0, Ljava/lang/Long;

    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    :goto_4
    move v4, v10

    .line 318
    goto/16 :goto_7

    .line 319
    .line 320
    :pswitch_15
    move-object v0, v2

    .line 321
    check-cast v0, Ljava/lang/Integer;

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    :goto_5
    move v4, v11

    .line 327
    goto/16 :goto_7

    .line 328
    .line 329
    :pswitch_16
    move-object v0, v2

    .line 330
    check-cast v0, Ljava/lang/Integer;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    int-to-long v2, v0

    .line 337
    invoke-static {v2, v3}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    goto/16 :goto_7

    .line 342
    .line 343
    :pswitch_17
    move-object v0, v2

    .line 344
    check-cast v0, Ljava/lang/Integer;

    .line 345
    .line 346
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    goto/16 :goto_7

    .line 355
    .line 356
    :pswitch_18
    instance-of v0, v2, Landroidx/datastore/preferences/protobuf/g;

    .line 357
    .line 358
    if-eqz v0, :cond_4

    .line 359
    .line 360
    move-object v0, v2

    .line 361
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 362
    .line 363
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    :goto_6
    add-int v4, v2, v0

    .line 372
    .line 373
    goto/16 :goto_7

    .line 374
    .line 375
    :cond_4
    move-object v0, v2

    .line 376
    check-cast v0, [B

    .line 377
    .line 378
    array-length v0, v0

    .line 379
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    goto :goto_6

    .line 384
    :pswitch_19
    move-object v0, v2

    .line 385
    check-cast v0, Landroidx/datastore/preferences/protobuf/a;

    .line 386
    .line 387
    check-cast v0, Landroidx/datastore/preferences/protobuf/t;

    .line 388
    .line 389
    invoke-virtual {v0, v12}, Landroidx/datastore/preferences/protobuf/t;->a(Landroidx/datastore/preferences/protobuf/T;)I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    goto :goto_6

    .line 398
    :pswitch_1a
    move-object v0, v2

    .line 399
    check-cast v0, Landroidx/datastore/preferences/protobuf/a;

    .line 400
    .line 401
    check-cast v0, Landroidx/datastore/preferences/protobuf/t;

    .line 402
    .line 403
    invoke-virtual {v0, v12}, Landroidx/datastore/preferences/protobuf/t;->a(Landroidx/datastore/preferences/protobuf/T;)I

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    goto :goto_7

    .line 408
    :pswitch_1b
    instance-of v0, v2, Landroidx/datastore/preferences/protobuf/g;

    .line 409
    .line 410
    if-eqz v0, :cond_5

    .line 411
    .line 412
    move-object v0, v2

    .line 413
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 414
    .line 415
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->M(I)I

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    goto :goto_6

    .line 424
    :cond_5
    move-object v0, v2

    .line 425
    check-cast v0, Ljava/lang/String;

    .line 426
    .line 427
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->K(Ljava/lang/String;)I

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    goto :goto_7

    .line 432
    :pswitch_1c
    move-object v0, v2

    .line 433
    check-cast v0, Ljava/lang/Boolean;

    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    goto :goto_7

    .line 439
    :pswitch_1d
    move-object v0, v2

    .line 440
    check-cast v0, Ljava/lang/Integer;

    .line 441
    .line 442
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    goto :goto_5

    .line 446
    :pswitch_1e
    move-object v0, v2

    .line 447
    check-cast v0, Ljava/lang/Long;

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    goto/16 :goto_4

    .line 453
    .line 454
    :pswitch_1f
    move-object v0, v2

    .line 455
    check-cast v0, Ljava/lang/Integer;

    .line 456
    .line 457
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    int-to-long v2, v0

    .line 462
    invoke-static {v2, v3}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    goto :goto_7

    .line 467
    :pswitch_20
    move-object v0, v2

    .line 468
    check-cast v0, Ljava/lang/Long;

    .line 469
    .line 470
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 471
    .line 472
    .line 473
    move-result-wide v2

    .line 474
    invoke-static {v2, v3}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    goto :goto_7

    .line 479
    :pswitch_21
    move-object v0, v2

    .line 480
    check-cast v0, Ljava/lang/Long;

    .line 481
    .line 482
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 483
    .line 484
    .line 485
    move-result-wide v2

    .line 486
    invoke-static {v2, v3}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    goto :goto_7

    .line 491
    :pswitch_22
    move-object v0, v2

    .line 492
    check-cast v0, Ljava/lang/Float;

    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    goto/16 :goto_5

    .line 498
    .line 499
    :pswitch_23
    move-object v0, v2

    .line 500
    check-cast v0, Ljava/lang/Double;

    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    goto/16 :goto_4

    .line 506
    .line 507
    :goto_7
    add-int/2addr v4, v5

    .line 508
    add-int/2addr v4, v1

    .line 509
    return v4

    .line 510
    nop

    .line 511
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
    .end packed-switch
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
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
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method
