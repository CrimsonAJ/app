.class public final Ls3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls3/a;


# instance fields
.field public final a:LP5/S;

.field public final b:I


# direct methods
.method public constructor <init>(ILP5/S;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ls3/f;->b:I

    .line 5
    .line 6
    iput-object p2, p0, Ls3/f;->a:LP5/S;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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
.end method

.method public static c(ILA4/r;)Ls3/f;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "initialCapacity"

    .line 5
    .line 6
    invoke-static {v1, v2}, LP5/q;->c(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-array v2, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    iget v3, v0, LA4/r;->b:I

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, -0x2

    .line 15
    move v6, v4

    .line 16
    :goto_0
    invoke-virtual {v0}, LA4/r;->e()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const/16 v8, 0x8

    .line 21
    .line 22
    if-le v7, v8, :cond_12

    .line 23
    .line 24
    invoke-virtual {v0}, LA4/r;->k()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    invoke-virtual {v0}, LA4/r;->k()I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    iget v10, v0, LA4/r;->a:I

    .line 33
    .line 34
    add-int/2addr v10, v9

    .line 35
    invoke-virtual {v0, v10}, LA4/r;->G(I)V

    .line 36
    .line 37
    .line 38
    const/4 v9, 0x1

    .line 39
    const v11, 0x5453494c

    .line 40
    .line 41
    .line 42
    const/4 v12, 0x2

    .line 43
    if-ne v7, v11, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, LA4/r;->k()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    invoke-static {v7, v0}, Ls3/f;->c(ILA4/r;)Ls3/f;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_0
    const/16 v11, 0xc

    .line 56
    .line 57
    const/4 v13, 0x0

    .line 58
    sparse-switch v7, :sswitch_data_0

    .line 59
    .line 60
    .line 61
    :goto_1
    move-object v7, v13

    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :sswitch_0
    new-instance v7, Ls3/h;

    .line 65
    .line 66
    invoke-virtual {v0}, LA4/r;->e()I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    sget-object v11, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 71
    .line 72
    invoke-virtual {v0, v8, v11}, LA4/r;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-direct {v7, v8}, Ls3/h;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :sswitch_1
    invoke-virtual {v0}, LA4/r;->k()I

    .line 82
    .line 83
    .line 84
    move-result v14

    .line 85
    invoke-virtual {v0, v11}, LA4/r;->I(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, LA4/r;->k()I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, LA4/r;->k()I

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    invoke-virtual {v0}, LA4/r;->k()I

    .line 96
    .line 97
    .line 98
    move-result v16

    .line 99
    invoke-virtual {v0, v1}, LA4/r;->I(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, LA4/r;->k()I

    .line 103
    .line 104
    .line 105
    move-result v17

    .line 106
    invoke-virtual {v0}, LA4/r;->k()I

    .line 107
    .line 108
    .line 109
    move-result v18

    .line 110
    invoke-virtual {v0, v8}, LA4/r;->I(I)V

    .line 111
    .line 112
    .line 113
    new-instance v13, Ls3/d;

    .line 114
    .line 115
    invoke-direct/range {v13 .. v18}, Ls3/d;-><init>(IIIII)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :sswitch_2
    invoke-virtual {v0}, LA4/r;->k()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-virtual {v0, v8}, LA4/r;->I(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, LA4/r;->k()I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    invoke-virtual {v0}, LA4/r;->k()I

    .line 131
    .line 132
    .line 133
    move-result v13

    .line 134
    invoke-virtual {v0, v1}, LA4/r;->I(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, LA4/r;->k()I

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v11}, LA4/r;->I(I)V

    .line 141
    .line 142
    .line 143
    new-instance v11, Ls3/c;

    .line 144
    .line 145
    invoke-direct {v11, v7, v8, v13}, Ls3/c;-><init>(III)V

    .line 146
    .line 147
    .line 148
    move-object v7, v11

    .line 149
    goto/16 :goto_4

    .line 150
    .line 151
    :sswitch_3
    const-string v7, "StreamFormatChunk"

    .line 152
    .line 153
    if-ne v5, v12, :cond_2

    .line 154
    .line 155
    invoke-virtual {v0, v1}, LA4/r;->I(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, LA4/r;->k()I

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    invoke-virtual {v0}, LA4/r;->k()I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    invoke-virtual {v0, v1}, LA4/r;->I(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, LA4/r;->k()I

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    sparse-switch v14, :sswitch_data_1

    .line 174
    .line 175
    .line 176
    move-object v15, v13

    .line 177
    goto :goto_2

    .line 178
    :sswitch_4
    const-string v15, "video/mjpeg"

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :sswitch_5
    const-string v15, "video/mp43"

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :sswitch_6
    const-string v15, "video/mp42"

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :sswitch_7
    const-string v15, "video/avc"

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :sswitch_8
    const-string v15, "video/mp4v-es"

    .line 191
    .line 192
    :goto_2
    if-nez v15, :cond_1

    .line 193
    .line 194
    const-string v8, "Ignoring track with unsupported compression "

    .line 195
    .line 196
    invoke-static {v8, v14, v7}, Lcom/google/android/gms/internal/measurement/k1;->v(Ljava/lang/String;ILjava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :cond_1
    new-instance v7, Lj3/L;

    .line 202
    .line 203
    invoke-direct {v7}, Lj3/L;-><init>()V

    .line 204
    .line 205
    .line 206
    iput v8, v7, Lj3/L;->p:I

    .line 207
    .line 208
    iput v11, v7, Lj3/L;->q:I

    .line 209
    .line 210
    iput-object v15, v7, Lj3/L;->k:Ljava/lang/String;

    .line 211
    .line 212
    new-instance v8, Ls3/g;

    .line 213
    .line 214
    new-instance v11, Lj3/M;

    .line 215
    .line 216
    invoke-direct {v11, v7}, Lj3/M;-><init>(Lj3/L;)V

    .line 217
    .line 218
    .line 219
    invoke-direct {v8, v11}, Ls3/g;-><init>(Lj3/M;)V

    .line 220
    .line 221
    .line 222
    move-object v7, v8

    .line 223
    goto/16 :goto_4

    .line 224
    .line 225
    :cond_2
    if-ne v5, v9, :cond_b

    .line 226
    .line 227
    invoke-virtual {v0}, LA4/r;->p()I

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    const-string v11, "audio/raw"

    .line 232
    .line 233
    const-string v14, "audio/mp4a-latm"

    .line 234
    .line 235
    if-eq v8, v9, :cond_7

    .line 236
    .line 237
    const/16 v15, 0x55

    .line 238
    .line 239
    if-eq v8, v15, :cond_6

    .line 240
    .line 241
    const/16 v15, 0xff

    .line 242
    .line 243
    if-eq v8, v15, :cond_5

    .line 244
    .line 245
    const/16 v15, 0x2000

    .line 246
    .line 247
    if-eq v8, v15, :cond_4

    .line 248
    .line 249
    const/16 v15, 0x2001

    .line 250
    .line 251
    if-eq v8, v15, :cond_3

    .line 252
    .line 253
    move-object v15, v13

    .line 254
    goto :goto_3

    .line 255
    :cond_3
    const-string v15, "audio/vnd.dts"

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_4
    const-string v15, "audio/ac3"

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_5
    move-object v15, v14

    .line 262
    goto :goto_3

    .line 263
    :cond_6
    const-string v15, "audio/mpeg"

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_7
    move-object v15, v11

    .line 267
    :goto_3
    if-nez v15, :cond_8

    .line 268
    .line 269
    const-string v11, "Ignoring track with unsupported format tag "

    .line 270
    .line 271
    invoke-static {v11, v8, v7}, Lcom/google/android/gms/internal/measurement/k1;->v(Ljava/lang/String;ILjava/lang/String;)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    :cond_8
    invoke-virtual {v0}, LA4/r;->p()I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    invoke-virtual {v0}, LA4/r;->k()I

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    const/4 v13, 0x6

    .line 285
    invoke-virtual {v0, v13}, LA4/r;->I(I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, LA4/r;->C()I

    .line 289
    .line 290
    .line 291
    move-result v13

    .line 292
    invoke-static {v13}, Ll4/y;->w(I)I

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    invoke-virtual {v0}, LA4/r;->p()I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    new-array v9, v1, [B

    .line 301
    .line 302
    invoke-virtual {v0, v9, v4, v1}, LA4/r;->h([BII)V

    .line 303
    .line 304
    .line 305
    new-instance v4, Lj3/L;

    .line 306
    .line 307
    invoke-direct {v4}, Lj3/L;-><init>()V

    .line 308
    .line 309
    .line 310
    iput-object v15, v4, Lj3/L;->k:Ljava/lang/String;

    .line 311
    .line 312
    iput v7, v4, Lj3/L;->x:I

    .line 313
    .line 314
    iput v8, v4, Lj3/L;->y:I

    .line 315
    .line 316
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-eqz v7, :cond_9

    .line 321
    .line 322
    if-eqz v13, :cond_9

    .line 323
    .line 324
    iput v13, v4, Lj3/L;->z:I

    .line 325
    .line 326
    :cond_9
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    if-eqz v7, :cond_a

    .line 331
    .line 332
    if-lez v1, :cond_a

    .line 333
    .line 334
    invoke-static {v9}, LP5/F;->s(Ljava/lang/Object;)LP5/S;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    iput-object v1, v4, Lj3/L;->m:Ljava/util/List;

    .line 339
    .line 340
    :cond_a
    new-instance v1, Ls3/g;

    .line 341
    .line 342
    new-instance v7, Lj3/M;

    .line 343
    .line 344
    invoke-direct {v7, v4}, Lj3/M;-><init>(Lj3/L;)V

    .line 345
    .line 346
    .line 347
    invoke-direct {v1, v7}, Ls3/g;-><init>(Lj3/M;)V

    .line 348
    .line 349
    .line 350
    move-object v7, v1

    .line 351
    goto :goto_4

    .line 352
    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    const-string v4, "Ignoring strf box for unsupported track type: "

    .line 355
    .line 356
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-static {v5}, Ll4/y;->C(I)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-static {v7, v1}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :goto_4
    if-eqz v7, :cond_11

    .line 376
    .line 377
    invoke-interface {v7}, Ls3/a;->a()I

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    const v4, 0x68727473

    .line 382
    .line 383
    .line 384
    if-ne v1, v4, :cond_f

    .line 385
    .line 386
    move-object v1, v7

    .line 387
    check-cast v1, Ls3/d;

    .line 388
    .line 389
    const v4, 0x73646976

    .line 390
    .line 391
    .line 392
    iget v1, v1, Ls3/d;->a:I

    .line 393
    .line 394
    if-eq v1, v4, :cond_e

    .line 395
    .line 396
    const v4, 0x73647561

    .line 397
    .line 398
    .line 399
    if-eq v1, v4, :cond_d

    .line 400
    .line 401
    const v4, 0x73747874

    .line 402
    .line 403
    .line 404
    if-eq v1, v4, :cond_c

    .line 405
    .line 406
    new-instance v4, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    const-string v5, "Found unsupported streamType fourCC: "

    .line 409
    .line 410
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    const-string v4, "AviStreamHeaderChunk"

    .line 425
    .line 426
    invoke-static {v4, v1}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    const/4 v1, -0x1

    .line 430
    :goto_5
    move v5, v1

    .line 431
    goto :goto_6

    .line 432
    :cond_c
    const/4 v1, 0x3

    .line 433
    goto :goto_5

    .line 434
    :cond_d
    const/4 v5, 0x1

    .line 435
    goto :goto_6

    .line 436
    :cond_e
    move v5, v12

    .line 437
    :cond_f
    :goto_6
    add-int/lit8 v1, v6, 0x1

    .line 438
    .line 439
    array-length v4, v2

    .line 440
    if-ge v4, v1, :cond_10

    .line 441
    .line 442
    array-length v4, v2

    .line 443
    invoke-static {v4, v1}, LP5/C;->e(II)I

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    :cond_10
    aput-object v7, v2, v6

    .line 452
    .line 453
    move v6, v1

    .line 454
    :cond_11
    invoke-virtual {v0, v10}, LA4/r;->H(I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0, v3}, LA4/r;->G(I)V

    .line 458
    .line 459
    .line 460
    const/4 v1, 0x4

    .line 461
    const/4 v4, 0x0

    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :cond_12
    new-instance v0, Ls3/f;

    .line 465
    .line 466
    invoke-static {v6, v2}, LP5/F;->k(I[Ljava/lang/Object;)LP5/S;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    move/from16 v2, p0

    .line 471
    .line 472
    invoke-direct {v0, v2, v1}, Ls3/f;-><init>(ILP5/S;)V

    .line 473
    .line 474
    .line 475
    return-object v0

    .line 476
    nop

    .line 477
    :sswitch_data_0
    .sparse-switch
        0x66727473 -> :sswitch_3
        0x68697661 -> :sswitch_2
        0x68727473 -> :sswitch_1
        0x6e727473 -> :sswitch_0
    .end sparse-switch

    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    :sswitch_data_1
    .sparse-switch
        0x30355844 -> :sswitch_8
        0x31435641 -> :sswitch_7
        0x31637661 -> :sswitch_7
        0x3234504d -> :sswitch_6
        0x3334504d -> :sswitch_5
        0x34363248 -> :sswitch_7
        0x34504d46 -> :sswitch_8
        0x44495633 -> :sswitch_8
        0x44495658 -> :sswitch_8
        0x47504a4d -> :sswitch_4
        0x58564944 -> :sswitch_8
        0x64697678 -> :sswitch_8
        0x67706a6d -> :sswitch_4
        0x78766964 -> :sswitch_8
    .end sparse-switch
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
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
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ls3/f;->b:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method

.method public final b(Ljava/lang/Class;)Ls3/a;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ls3/f;->a:LP5/S;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, LP5/F;->q(I)LP5/D;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, LP5/D;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, LP5/D;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ls3/a;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-ne v2, p1, :cond_0

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return-object p1
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
.end method
