.class public final Li5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Li5/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Li5/b;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    move v5, v4

    .line 17
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-ge v6, v2, :cond_3

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    int-to-char v7, v6

    .line 28
    const/4 v8, 0x2

    .line 29
    if-eq v7, v8, :cond_2

    .line 30
    .line 31
    const/4 v8, 0x3

    .line 32
    if-eq v7, v8, :cond_1

    .line 33
    .line 34
    const/4 v8, 0x4

    .line 35
    if-eq v7, v8, :cond_0

    .line 36
    .line 37
    invoke-static {v1, v6}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v1, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-static {v1, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {v1, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Lt4/s;

    .line 60
    .line 61
    invoke-direct {v1, v3, v4, v5}, Lt4/s;-><init>(III)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_0
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const/4 v3, 0x0

    .line 70
    move-object v4, v3

    .line 71
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-ge v5, v2, :cond_6

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    int-to-char v6, v5

    .line 82
    const/4 v7, 0x2

    .line 83
    if-eq v6, v7, :cond_5

    .line 84
    .line 85
    const/4 v7, 0x3

    .line 86
    if-eq v6, v7, :cond_4

    .line 87
    .line 88
    invoke-static {v1, v5}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-static {v1, v5}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    goto :goto_1

    .line 97
    :cond_5
    invoke-static {v1, v5}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    goto :goto_1

    .line 102
    :cond_6
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Lt4/r;

    .line 106
    .line 107
    invoke-direct {v1, v3, v4}, Lt4/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object v1

    .line 111
    :pswitch_1
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    const/4 v3, 0x0

    .line 116
    const/4 v4, 0x0

    .line 117
    const/4 v5, 0x0

    .line 118
    move-object v15, v3

    .line 119
    move-object/from16 v18, v15

    .line 120
    .line 121
    move v8, v4

    .line 122
    move v9, v8

    .line 123
    move v10, v9

    .line 124
    move v11, v10

    .line 125
    move v12, v11

    .line 126
    move v13, v12

    .line 127
    move v14, v13

    .line 128
    move/from16 v16, v14

    .line 129
    .line 130
    move/from16 v17, v16

    .line 131
    .line 132
    move v7, v5

    .line 133
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-ge v3, v2, :cond_7

    .line 138
    .line 139
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    int-to-char v4, v3

    .line 144
    packed-switch v4, :pswitch_data_1

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v3}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :pswitch_2
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v18

    .line 155
    goto :goto_2

    .line 156
    :pswitch_3
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 157
    .line 158
    .line 159
    move-result v17

    .line 160
    goto :goto_2

    .line 161
    :pswitch_4
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 162
    .line 163
    .line 164
    move-result v16

    .line 165
    goto :goto_2

    .line 166
    :pswitch_5
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v15

    .line 170
    goto :goto_2

    .line 171
    :pswitch_6
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 172
    .line 173
    .line 174
    move-result v14

    .line 175
    goto :goto_2

    .line 176
    :pswitch_7
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    goto :goto_2

    .line 181
    :pswitch_8
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    goto :goto_2

    .line 186
    :pswitch_9
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    goto :goto_2

    .line 191
    :pswitch_a
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    goto :goto_2

    .line 196
    :pswitch_b
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    goto :goto_2

    .line 201
    :pswitch_c
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 202
    .line 203
    .line 204
    move-result v8

    .line 205
    goto :goto_2

    .line 206
    :pswitch_d
    const/4 v4, 0x4

    .line 207
    invoke-static {v1, v3, v4}, Ls8/e;->k0(Landroid/os/Parcel;II)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    goto :goto_2

    .line 215
    :cond_7
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 216
    .line 217
    .line 218
    new-instance v6, Lt4/q;

    .line 219
    .line 220
    invoke-direct/range {v6 .. v18}, Lt4/q;-><init>(FIIIIIIILjava/lang/String;IILjava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-object v6

    .line 224
    :pswitch_e
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    const/4 v3, 0x0

    .line 229
    const/4 v4, 0x0

    .line 230
    move v15, v3

    .line 231
    move-object v6, v4

    .line 232
    move-object v7, v6

    .line 233
    move-object v8, v7

    .line 234
    move-object v9, v8

    .line 235
    move-object v10, v9

    .line 236
    move-object v11, v10

    .line 237
    move-object v12, v11

    .line 238
    move-object v13, v12

    .line 239
    move-object v14, v13

    .line 240
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-ge v3, v2, :cond_8

    .line 245
    .line 246
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    int-to-char v4, v3

    .line 251
    packed-switch v4, :pswitch_data_2

    .line 252
    .line 253
    .line 254
    invoke-static {v1, v3}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :pswitch_f
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 259
    .line 260
    .line 261
    move-result v15

    .line 262
    goto :goto_3

    .line 263
    :pswitch_10
    invoke-static {v1, v3}, Ls8/e;->Q(Landroid/os/Parcel;I)Ljava/lang/Boolean;

    .line 264
    .line 265
    .line 266
    move-result-object v14

    .line 267
    goto :goto_3

    .line 268
    :pswitch_11
    invoke-static {v1, v3}, Ls8/e;->Q(Landroid/os/Parcel;I)Ljava/lang/Boolean;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    goto :goto_3

    .line 273
    :pswitch_12
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    goto :goto_3

    .line 278
    :pswitch_13
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    goto :goto_3

    .line 283
    :pswitch_14
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 284
    .line 285
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    move-object v10, v3

    .line 290
    check-cast v10, Landroid/net/Uri;

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :pswitch_15
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    goto :goto_3

    .line 298
    :pswitch_16
    invoke-static {v1, v3}, Ls8/e;->p(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    goto :goto_3

    .line 303
    :pswitch_17
    sget-object v4, LE4/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 304
    .line 305
    invoke-static {v1, v3, v4}, Ls8/e;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 306
    .line 307
    .line 308
    goto :goto_3

    .line 309
    :pswitch_18
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v7

    .line 313
    goto :goto_3

    .line 314
    :pswitch_19
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    goto :goto_3

    .line 319
    :cond_8
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 320
    .line 321
    .line 322
    new-instance v5, Lt4/d;

    .line 323
    .line 324
    invoke-direct/range {v5 .. v15}, Lt4/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 325
    .line 326
    .line 327
    return-object v5

    .line 328
    :pswitch_1a
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    const/4 v3, 0x0

    .line 333
    const/4 v4, 0x0

    .line 334
    const-wide/16 v5, 0x0

    .line 335
    .line 336
    move-object v11, v3

    .line 337
    move-object v12, v11

    .line 338
    move-object v13, v12

    .line 339
    move-object v14, v13

    .line 340
    move-object/from16 v16, v14

    .line 341
    .line 342
    move v10, v4

    .line 343
    move v15, v10

    .line 344
    move-wide v8, v5

    .line 345
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    if-ge v4, v2, :cond_9

    .line 350
    .line 351
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    int-to-char v5, v4

    .line 356
    packed-switch v5, :pswitch_data_3

    .line 357
    .line 358
    .line 359
    invoke-static {v1, v4}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 360
    .line 361
    .line 362
    goto :goto_4

    .line 363
    :pswitch_1b
    invoke-static {v1, v4}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    goto :goto_4

    .line 368
    :pswitch_1c
    invoke-static {v1, v4}, Ls8/e;->p(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    move-object/from16 v16, v4

    .line 373
    .line 374
    goto :goto_4

    .line 375
    :pswitch_1d
    invoke-static {v1, v4}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    move v15, v4

    .line 380
    goto :goto_4

    .line 381
    :pswitch_1e
    invoke-static {v1, v4}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    move-object v14, v4

    .line 386
    goto :goto_4

    .line 387
    :pswitch_1f
    invoke-static {v1, v4}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    move-object v13, v4

    .line 392
    goto :goto_4

    .line 393
    :pswitch_20
    invoke-static {v1, v4}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    move-object v12, v4

    .line 398
    goto :goto_4

    .line 399
    :pswitch_21
    invoke-static {v1, v4}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    move-object v11, v4

    .line 404
    goto :goto_4

    .line 405
    :pswitch_22
    invoke-static {v1, v4}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    move v10, v4

    .line 410
    goto :goto_4

    .line 411
    :pswitch_23
    invoke-static {v1, v4}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 412
    .line 413
    .line 414
    move-result-wide v4

    .line 415
    move-wide v8, v4

    .line 416
    goto :goto_4

    .line 417
    :cond_9
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 418
    .line 419
    .line 420
    new-instance v7, Lcom/google/android/gms/cast/MediaTrack;

    .line 421
    .line 422
    invoke-static {v3}, Ly4/a;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 423
    .line 424
    .line 425
    move-result-object v17

    .line 426
    invoke-direct/range {v7 .. v17}, Lcom/google/android/gms/cast/MediaTrack;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lorg/json/JSONObject;)V

    .line 427
    .line 428
    .line 429
    return-object v7

    .line 430
    :pswitch_24
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    const/4 v3, 0x0

    .line 435
    const/4 v4, 0x0

    .line 436
    const-wide/16 v5, 0x0

    .line 437
    .line 438
    const-wide/16 v7, 0x0

    .line 439
    .line 440
    move-object v10, v3

    .line 441
    move-object/from16 v25, v10

    .line 442
    .line 443
    move-object/from16 v28, v25

    .line 444
    .line 445
    move-object/from16 v30, v28

    .line 446
    .line 447
    move-object/from16 v32, v30

    .line 448
    .line 449
    move-object/from16 v33, v32

    .line 450
    .line 451
    move-object/from16 v34, v33

    .line 452
    .line 453
    move-object/from16 v35, v34

    .line 454
    .line 455
    move v13, v4

    .line 456
    move/from16 v16, v13

    .line 457
    .line 458
    move/from16 v17, v16

    .line 459
    .line 460
    move/from16 v24, v17

    .line 461
    .line 462
    move/from16 v26, v24

    .line 463
    .line 464
    move/from16 v27, v26

    .line 465
    .line 466
    move/from16 v29, v27

    .line 467
    .line 468
    move/from16 v31, v29

    .line 469
    .line 470
    move-wide v14, v5

    .line 471
    move-wide/from16 v22, v14

    .line 472
    .line 473
    move-wide v11, v7

    .line 474
    move-wide/from16 v18, v11

    .line 475
    .line 476
    move-wide/from16 v20, v18

    .line 477
    .line 478
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    if-ge v3, v2, :cond_a

    .line 483
    .line 484
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    int-to-char v4, v3

    .line 489
    packed-switch v4, :pswitch_data_4

    .line 490
    .line 491
    .line 492
    invoke-static {v1, v3}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 493
    .line 494
    .line 495
    goto :goto_5

    .line 496
    :pswitch_25
    sget-object v4, Lt4/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 497
    .line 498
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    check-cast v3, Lt4/m;

    .line 503
    .line 504
    move-object/from16 v35, v3

    .line 505
    .line 506
    goto :goto_5

    .line 507
    :pswitch_26
    sget-object v4, Lt4/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 508
    .line 509
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    check-cast v3, Lt4/j;

    .line 514
    .line 515
    move-object/from16 v34, v3

    .line 516
    .line 517
    goto :goto_5

    .line 518
    :pswitch_27
    sget-object v4, Lt4/s;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 519
    .line 520
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    check-cast v3, Lt4/s;

    .line 525
    .line 526
    move-object/from16 v33, v3

    .line 527
    .line 528
    goto :goto_5

    .line 529
    :pswitch_28
    sget-object v4, Lt4/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 530
    .line 531
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    check-cast v3, Lt4/c;

    .line 536
    .line 537
    move-object/from16 v32, v3

    .line 538
    .line 539
    goto :goto_5

    .line 540
    :pswitch_29
    invoke-static {v1, v3}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    move/from16 v31, v3

    .line 545
    .line 546
    goto :goto_5

    .line 547
    :pswitch_2a
    sget-object v4, Lt4/n;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 548
    .line 549
    invoke-static {v1, v3, v4}, Ls8/e;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    move-object/from16 v30, v3

    .line 554
    .line 555
    goto :goto_5

    .line 556
    :pswitch_2b
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    move/from16 v29, v3

    .line 561
    .line 562
    goto :goto_5

    .line 563
    :pswitch_2c
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    move-object/from16 v28, v3

    .line 568
    .line 569
    goto :goto_5

    .line 570
    :pswitch_2d
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    move/from16 v27, v3

    .line 575
    .line 576
    goto :goto_5

    .line 577
    :pswitch_2e
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    move/from16 v26, v3

    .line 582
    .line 583
    goto :goto_5

    .line 584
    :pswitch_2f
    invoke-static {v1, v3}, Ls8/e;->m(Landroid/os/Parcel;I)[J

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    move-object/from16 v25, v3

    .line 589
    .line 590
    goto :goto_5

    .line 591
    :pswitch_30
    invoke-static {v1, v3}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    move/from16 v24, v3

    .line 596
    .line 597
    goto :goto_5

    .line 598
    :pswitch_31
    invoke-static {v1, v3}, Ls8/e;->R(Landroid/os/Parcel;I)D

    .line 599
    .line 600
    .line 601
    move-result-wide v3

    .line 602
    move-wide/from16 v22, v3

    .line 603
    .line 604
    goto :goto_5

    .line 605
    :pswitch_32
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 606
    .line 607
    .line 608
    move-result-wide v3

    .line 609
    move-wide/from16 v20, v3

    .line 610
    .line 611
    goto/16 :goto_5

    .line 612
    .line 613
    :pswitch_33
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 614
    .line 615
    .line 616
    move-result-wide v3

    .line 617
    move-wide/from16 v18, v3

    .line 618
    .line 619
    goto/16 :goto_5

    .line 620
    .line 621
    :pswitch_34
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    move/from16 v17, v3

    .line 626
    .line 627
    goto/16 :goto_5

    .line 628
    .line 629
    :pswitch_35
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    move/from16 v16, v3

    .line 634
    .line 635
    goto/16 :goto_5

    .line 636
    .line 637
    :pswitch_36
    invoke-static {v1, v3}, Ls8/e;->R(Landroid/os/Parcel;I)D

    .line 638
    .line 639
    .line 640
    move-result-wide v3

    .line 641
    move-wide v14, v3

    .line 642
    goto/16 :goto_5

    .line 643
    .line 644
    :pswitch_37
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 645
    .line 646
    .line 647
    move-result v3

    .line 648
    move v13, v3

    .line 649
    goto/16 :goto_5

    .line 650
    .line 651
    :pswitch_38
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 652
    .line 653
    .line 654
    move-result-wide v3

    .line 655
    move-wide v11, v3

    .line 656
    goto/16 :goto_5

    .line 657
    .line 658
    :pswitch_39
    sget-object v4, Lcom/google/android/gms/cast/MediaInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 659
    .line 660
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    check-cast v3, Lcom/google/android/gms/cast/MediaInfo;

    .line 665
    .line 666
    move-object v10, v3

    .line 667
    goto/16 :goto_5

    .line 668
    .line 669
    :cond_a
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 670
    .line 671
    .line 672
    new-instance v9, Lt4/p;

    .line 673
    .line 674
    invoke-direct/range {v9 .. v35}, Lt4/p;-><init>(Lcom/google/android/gms/cast/MediaInfo;JIDIIJJDZ[JIILjava/lang/String;ILjava/util/ArrayList;ZLt4/c;Lt4/s;Lt4/j;Lt4/m;)V

    .line 675
    .line 676
    .line 677
    return-object v9

    .line 678
    :pswitch_3a
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 679
    .line 680
    .line 681
    move-result v2

    .line 682
    const/4 v3, 0x0

    .line 683
    const-wide/16 v4, 0x0

    .line 684
    .line 685
    const/4 v6, 0x0

    .line 686
    move-object v8, v3

    .line 687
    move-object/from16 v17, v8

    .line 688
    .line 689
    move-object/from16 v18, v17

    .line 690
    .line 691
    move-wide v11, v4

    .line 692
    move-wide v13, v11

    .line 693
    move-wide v15, v13

    .line 694
    move v9, v6

    .line 695
    move v10, v9

    .line 696
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 697
    .line 698
    .line 699
    move-result v3

    .line 700
    if-ge v3, v2, :cond_b

    .line 701
    .line 702
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 703
    .line 704
    .line 705
    move-result v3

    .line 706
    int-to-char v4, v3

    .line 707
    packed-switch v4, :pswitch_data_5

    .line 708
    .line 709
    .line 710
    invoke-static {v1, v3}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 711
    .line 712
    .line 713
    goto :goto_6

    .line 714
    :pswitch_3b
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    move-object/from16 v18, v3

    .line 719
    .line 720
    goto :goto_6

    .line 721
    :pswitch_3c
    invoke-static {v1, v3}, Ls8/e;->m(Landroid/os/Parcel;I)[J

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    move-object/from16 v17, v3

    .line 726
    .line 727
    goto :goto_6

    .line 728
    :pswitch_3d
    invoke-static {v1, v3}, Ls8/e;->R(Landroid/os/Parcel;I)D

    .line 729
    .line 730
    .line 731
    move-result-wide v3

    .line 732
    move-wide v15, v3

    .line 733
    goto :goto_6

    .line 734
    :pswitch_3e
    invoke-static {v1, v3}, Ls8/e;->R(Landroid/os/Parcel;I)D

    .line 735
    .line 736
    .line 737
    move-result-wide v3

    .line 738
    move-wide v13, v3

    .line 739
    goto :goto_6

    .line 740
    :pswitch_3f
    invoke-static {v1, v3}, Ls8/e;->R(Landroid/os/Parcel;I)D

    .line 741
    .line 742
    .line 743
    move-result-wide v3

    .line 744
    move-wide v11, v3

    .line 745
    goto :goto_6

    .line 746
    :pswitch_40
    invoke-static {v1, v3}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 747
    .line 748
    .line 749
    move-result v3

    .line 750
    move v10, v3

    .line 751
    goto :goto_6

    .line 752
    :pswitch_41
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 753
    .line 754
    .line 755
    move-result v3

    .line 756
    move v9, v3

    .line 757
    goto :goto_6

    .line 758
    :pswitch_42
    sget-object v4, Lcom/google/android/gms/cast/MediaInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 759
    .line 760
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    check-cast v3, Lcom/google/android/gms/cast/MediaInfo;

    .line 765
    .line 766
    move-object v8, v3

    .line 767
    goto :goto_6

    .line 768
    :cond_b
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 769
    .line 770
    .line 771
    new-instance v7, Lt4/n;

    .line 772
    .line 773
    invoke-direct/range {v7 .. v18}, Lt4/n;-><init>(Lcom/google/android/gms/cast/MediaInfo;IZDDD[JLjava/lang/String;)V

    .line 774
    .line 775
    .line 776
    return-object v7

    .line 777
    :pswitch_43
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 778
    .line 779
    .line 780
    move-result v2

    .line 781
    const/4 v3, 0x0

    .line 782
    const-wide/16 v4, 0x0

    .line 783
    .line 784
    const/4 v6, 0x0

    .line 785
    move-wide v7, v4

    .line 786
    move-object v9, v6

    .line 787
    move-object v10, v9

    .line 788
    move-object v11, v10

    .line 789
    move-object v12, v11

    .line 790
    move-object v13, v12

    .line 791
    move v4, v3

    .line 792
    move v5, v4

    .line 793
    move v6, v5

    .line 794
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 795
    .line 796
    .line 797
    move-result v14

    .line 798
    if-ge v14, v2, :cond_c

    .line 799
    .line 800
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 801
    .line 802
    .line 803
    move-result v14

    .line 804
    int-to-char v15, v14

    .line 805
    packed-switch v15, :pswitch_data_6

    .line 806
    .line 807
    .line 808
    invoke-static {v1, v14}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 809
    .line 810
    .line 811
    goto :goto_7

    .line 812
    :pswitch_44
    invoke-static {v1, v14}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 813
    .line 814
    .line 815
    move-result v6

    .line 816
    goto :goto_7

    .line 817
    :pswitch_45
    invoke-static {v1, v14}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 818
    .line 819
    .line 820
    move-result-wide v7

    .line 821
    goto :goto_7

    .line 822
    :pswitch_46
    invoke-static {v1, v14}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 823
    .line 824
    .line 825
    move-result v5

    .line 826
    goto :goto_7

    .line 827
    :pswitch_47
    sget-object v13, Lt4/n;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 828
    .line 829
    invoke-static {v1, v14, v13}, Ls8/e;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 830
    .line 831
    .line 832
    move-result-object v13

    .line 833
    goto :goto_7

    .line 834
    :pswitch_48
    invoke-static {v1, v14}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 835
    .line 836
    .line 837
    move-result v4

    .line 838
    goto :goto_7

    .line 839
    :pswitch_49
    sget-object v12, Lt4/l;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 840
    .line 841
    invoke-static {v1, v14, v12}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 842
    .line 843
    .line 844
    move-result-object v12

    .line 845
    check-cast v12, Lt4/l;

    .line 846
    .line 847
    goto :goto_7

    .line 848
    :pswitch_4a
    invoke-static {v1, v14}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v11

    .line 852
    goto :goto_7

    .line 853
    :pswitch_4b
    invoke-static {v1, v14}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 854
    .line 855
    .line 856
    move-result v3

    .line 857
    goto :goto_7

    .line 858
    :pswitch_4c
    invoke-static {v1, v14}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v10

    .line 862
    goto :goto_7

    .line 863
    :pswitch_4d
    invoke-static {v1, v14}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v9

    .line 867
    goto :goto_7

    .line 868
    :cond_c
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 869
    .line 870
    .line 871
    new-instance v1, Lt4/m;

    .line 872
    .line 873
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 874
    .line 875
    .line 876
    iput-object v9, v1, Lt4/m;->a:Ljava/lang/String;

    .line 877
    .line 878
    iput-object v10, v1, Lt4/m;->b:Ljava/lang/String;

    .line 879
    .line 880
    iput v3, v1, Lt4/m;->c:I

    .line 881
    .line 882
    iput-object v11, v1, Lt4/m;->d:Ljava/lang/String;

    .line 883
    .line 884
    iput-object v12, v1, Lt4/m;->e:Lt4/l;

    .line 885
    .line 886
    iput v4, v1, Lt4/m;->f:I

    .line 887
    .line 888
    iput-object v13, v1, Lt4/m;->g:Ljava/util/ArrayList;

    .line 889
    .line 890
    iput v5, v1, Lt4/m;->h:I

    .line 891
    .line 892
    iput-wide v7, v1, Lt4/m;->i:J

    .line 893
    .line 894
    iput-boolean v6, v1, Lt4/m;->j:Z

    .line 895
    .line 896
    return-object v1

    .line 897
    :pswitch_4e
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    const-wide/16 v3, 0x0

    .line 902
    .line 903
    const/4 v5, 0x0

    .line 904
    const/4 v6, 0x0

    .line 905
    move-object v7, v5

    .line 906
    move v8, v6

    .line 907
    move-object v6, v7

    .line 908
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 909
    .line 910
    .line 911
    move-result v9

    .line 912
    if-ge v9, v2, :cond_12

    .line 913
    .line 914
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 915
    .line 916
    .line 917
    move-result v9

    .line 918
    int-to-char v10, v9

    .line 919
    const/4 v11, 0x2

    .line 920
    if-eq v10, v11, :cond_11

    .line 921
    .line 922
    const/4 v11, 0x3

    .line 923
    if-eq v10, v11, :cond_10

    .line 924
    .line 925
    const/4 v11, 0x4

    .line 926
    if-eq v10, v11, :cond_f

    .line 927
    .line 928
    const/4 v11, 0x5

    .line 929
    if-eq v10, v11, :cond_e

    .line 930
    .line 931
    const/4 v11, 0x6

    .line 932
    if-eq v10, v11, :cond_d

    .line 933
    .line 934
    invoke-static {v1, v9}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 935
    .line 936
    .line 937
    goto :goto_8

    .line 938
    :cond_d
    invoke-static {v1, v9}, Ls8/e;->R(Landroid/os/Parcel;I)D

    .line 939
    .line 940
    .line 941
    move-result-wide v3

    .line 942
    goto :goto_8

    .line 943
    :cond_e
    sget-object v7, LE4/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 944
    .line 945
    invoke-static {v1, v9, v7}, Ls8/e;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 946
    .line 947
    .line 948
    move-result-object v7

    .line 949
    goto :goto_8

    .line 950
    :cond_f
    sget-object v6, Lt4/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 951
    .line 952
    invoke-static {v1, v9, v6}, Ls8/e;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 953
    .line 954
    .line 955
    move-result-object v6

    .line 956
    goto :goto_8

    .line 957
    :cond_10
    invoke-static {v1, v9}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v5

    .line 961
    goto :goto_8

    .line 962
    :cond_11
    invoke-static {v1, v9}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 963
    .line 964
    .line 965
    move-result v8

    .line 966
    goto :goto_8

    .line 967
    :cond_12
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 968
    .line 969
    .line 970
    new-instance v1, Lt4/l;

    .line 971
    .line 972
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 973
    .line 974
    .line 975
    iput v8, v1, Lt4/l;->a:I

    .line 976
    .line 977
    iput-object v5, v1, Lt4/l;->b:Ljava/lang/String;

    .line 978
    .line 979
    iput-object v6, v1, Lt4/l;->c:Ljava/util/ArrayList;

    .line 980
    .line 981
    iput-object v7, v1, Lt4/l;->d:Ljava/util/ArrayList;

    .line 982
    .line 983
    iput-wide v3, v1, Lt4/l;->e:D

    .line 984
    .line 985
    return-object v1

    .line 986
    :pswitch_4f
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 987
    .line 988
    .line 989
    move-result v2

    .line 990
    const/4 v3, 0x0

    .line 991
    const/4 v4, 0x0

    .line 992
    move-object v5, v4

    .line 993
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 994
    .line 995
    .line 996
    move-result v6

    .line 997
    if-ge v6, v2, :cond_16

    .line 998
    .line 999
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1000
    .line 1001
    .line 1002
    move-result v6

    .line 1003
    int-to-char v7, v6

    .line 1004
    const/4 v8, 0x2

    .line 1005
    if-eq v7, v8, :cond_15

    .line 1006
    .line 1007
    const/4 v8, 0x3

    .line 1008
    if-eq v7, v8, :cond_14

    .line 1009
    .line 1010
    const/4 v8, 0x4

    .line 1011
    if-eq v7, v8, :cond_13

    .line 1012
    .line 1013
    invoke-static {v1, v6}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1014
    .line 1015
    .line 1016
    goto :goto_9

    .line 1017
    :cond_13
    invoke-static {v1, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1018
    .line 1019
    .line 1020
    move-result v3

    .line 1021
    goto :goto_9

    .line 1022
    :cond_14
    invoke-static {v1, v6}, Ls8/e;->i(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v5

    .line 1026
    goto :goto_9

    .line 1027
    :cond_15
    sget-object v4, LE4/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1028
    .line 1029
    invoke-static {v1, v6, v4}, Ls8/e;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v4

    .line 1033
    goto :goto_9

    .line 1034
    :cond_16
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1035
    .line 1036
    .line 1037
    new-instance v1, Lt4/k;

    .line 1038
    .line 1039
    invoke-direct {v1, v4, v5, v3}, Lt4/k;-><init>(Ljava/util/ArrayList;Landroid/os/Bundle;I)V

    .line 1040
    .line 1041
    .line 1042
    return-object v1

    .line 1043
    :pswitch_50
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1044
    .line 1045
    .line 1046
    move-result v2

    .line 1047
    const-wide/16 v3, 0x0

    .line 1048
    .line 1049
    const/4 v5, 0x0

    .line 1050
    move-wide v7, v3

    .line 1051
    move-wide v9, v7

    .line 1052
    move-wide v13, v9

    .line 1053
    move-object v11, v5

    .line 1054
    move-object v12, v11

    .line 1055
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1056
    .line 1057
    .line 1058
    move-result v3

    .line 1059
    if-ge v3, v2, :cond_1c

    .line 1060
    .line 1061
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1062
    .line 1063
    .line 1064
    move-result v3

    .line 1065
    int-to-char v4, v3

    .line 1066
    const/4 v5, 0x2

    .line 1067
    if-eq v4, v5, :cond_1b

    .line 1068
    .line 1069
    const/4 v5, 0x3

    .line 1070
    if-eq v4, v5, :cond_1a

    .line 1071
    .line 1072
    const/4 v5, 0x4

    .line 1073
    if-eq v4, v5, :cond_19

    .line 1074
    .line 1075
    const/4 v5, 0x5

    .line 1076
    if-eq v4, v5, :cond_18

    .line 1077
    .line 1078
    const/4 v5, 0x6

    .line 1079
    if-eq v4, v5, :cond_17

    .line 1080
    .line 1081
    invoke-static {v1, v3}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1082
    .line 1083
    .line 1084
    goto :goto_a

    .line 1085
    :cond_17
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1086
    .line 1087
    .line 1088
    move-result-wide v3

    .line 1089
    move-wide v13, v3

    .line 1090
    goto :goto_a

    .line 1091
    :cond_18
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v3

    .line 1095
    move-object v12, v3

    .line 1096
    goto :goto_a

    .line 1097
    :cond_19
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v3

    .line 1101
    move-object v11, v3

    .line 1102
    goto :goto_a

    .line 1103
    :cond_1a
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1104
    .line 1105
    .line 1106
    move-result-wide v3

    .line 1107
    move-wide v9, v3

    .line 1108
    goto :goto_a

    .line 1109
    :cond_1b
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1110
    .line 1111
    .line 1112
    move-result-wide v3

    .line 1113
    move-wide v7, v3

    .line 1114
    goto :goto_a

    .line 1115
    :cond_1c
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1116
    .line 1117
    .line 1118
    new-instance v6, Lt4/c;

    .line 1119
    .line 1120
    invoke-direct/range {v6 .. v14}, Lt4/c;-><init>(JJLjava/lang/String;Ljava/lang/String;J)V

    .line 1121
    .line 1122
    .line 1123
    return-object v6

    .line 1124
    :pswitch_51
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1125
    .line 1126
    .line 1127
    move-result v2

    .line 1128
    const/4 v3, 0x0

    .line 1129
    const-wide/16 v4, 0x0

    .line 1130
    .line 1131
    move v11, v3

    .line 1132
    move v12, v11

    .line 1133
    move-wide v7, v4

    .line 1134
    move-wide v9, v7

    .line 1135
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1136
    .line 1137
    .line 1138
    move-result v3

    .line 1139
    if-ge v3, v2, :cond_21

    .line 1140
    .line 1141
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1142
    .line 1143
    .line 1144
    move-result v3

    .line 1145
    int-to-char v4, v3

    .line 1146
    const/4 v5, 0x2

    .line 1147
    if-eq v4, v5, :cond_20

    .line 1148
    .line 1149
    const/4 v5, 0x3

    .line 1150
    if-eq v4, v5, :cond_1f

    .line 1151
    .line 1152
    const/4 v5, 0x4

    .line 1153
    if-eq v4, v5, :cond_1e

    .line 1154
    .line 1155
    const/4 v5, 0x5

    .line 1156
    if-eq v4, v5, :cond_1d

    .line 1157
    .line 1158
    invoke-static {v1, v3}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1159
    .line 1160
    .line 1161
    goto :goto_b

    .line 1162
    :cond_1d
    invoke-static {v1, v3}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v3

    .line 1166
    move v12, v3

    .line 1167
    goto :goto_b

    .line 1168
    :cond_1e
    invoke-static {v1, v3}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 1169
    .line 1170
    .line 1171
    move-result v3

    .line 1172
    move v11, v3

    .line 1173
    goto :goto_b

    .line 1174
    :cond_1f
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1175
    .line 1176
    .line 1177
    move-result-wide v3

    .line 1178
    move-wide v9, v3

    .line 1179
    goto :goto_b

    .line 1180
    :cond_20
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1181
    .line 1182
    .line 1183
    move-result-wide v3

    .line 1184
    move-wide v7, v3

    .line 1185
    goto :goto_b

    .line 1186
    :cond_21
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1187
    .line 1188
    .line 1189
    new-instance v6, Lt4/j;

    .line 1190
    .line 1191
    invoke-direct/range {v6 .. v12}, Lt4/j;-><init>(JJZZ)V

    .line 1192
    .line 1193
    .line 1194
    return-object v6

    .line 1195
    :pswitch_52
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1196
    .line 1197
    .line 1198
    move-result v2

    .line 1199
    const/4 v3, 0x0

    .line 1200
    const-wide/16 v4, 0x0

    .line 1201
    .line 1202
    const/4 v6, 0x0

    .line 1203
    move-object v8, v3

    .line 1204
    move-object v10, v8

    .line 1205
    move-object v11, v10

    .line 1206
    move-object v14, v11

    .line 1207
    move-object v15, v14

    .line 1208
    move-object/from16 v16, v15

    .line 1209
    .line 1210
    move-object/from16 v17, v16

    .line 1211
    .line 1212
    move-object/from16 v18, v17

    .line 1213
    .line 1214
    move-object/from16 v19, v18

    .line 1215
    .line 1216
    move-object/from16 v20, v19

    .line 1217
    .line 1218
    move-object/from16 v23, v20

    .line 1219
    .line 1220
    move-object/from16 v24, v23

    .line 1221
    .line 1222
    move-object/from16 v25, v24

    .line 1223
    .line 1224
    move-object/from16 v26, v25

    .line 1225
    .line 1226
    move-wide v12, v4

    .line 1227
    move-wide/from16 v21, v12

    .line 1228
    .line 1229
    move v9, v6

    .line 1230
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1231
    .line 1232
    .line 1233
    move-result v3

    .line 1234
    if-ge v3, v2, :cond_22

    .line 1235
    .line 1236
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1237
    .line 1238
    .line 1239
    move-result v3

    .line 1240
    int-to-char v4, v3

    .line 1241
    packed-switch v4, :pswitch_data_7

    .line 1242
    .line 1243
    .line 1244
    invoke-static {v1, v3}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1245
    .line 1246
    .line 1247
    goto :goto_c

    .line 1248
    :pswitch_53
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v3

    .line 1252
    move-object/from16 v26, v3

    .line 1253
    .line 1254
    goto :goto_c

    .line 1255
    :pswitch_54
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v3

    .line 1259
    move-object/from16 v25, v3

    .line 1260
    .line 1261
    goto :goto_c

    .line 1262
    :pswitch_55
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v3

    .line 1266
    move-object/from16 v24, v3

    .line 1267
    .line 1268
    goto :goto_c

    .line 1269
    :pswitch_56
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v3

    .line 1273
    move-object/from16 v23, v3

    .line 1274
    .line 1275
    goto :goto_c

    .line 1276
    :pswitch_57
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1277
    .line 1278
    .line 1279
    move-result-wide v3

    .line 1280
    move-wide/from16 v21, v3

    .line 1281
    .line 1282
    goto :goto_c

    .line 1283
    :pswitch_58
    sget-object v4, Lt4/r;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1284
    .line 1285
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v3

    .line 1289
    check-cast v3, Lt4/r;

    .line 1290
    .line 1291
    move-object/from16 v20, v3

    .line 1292
    .line 1293
    goto :goto_c

    .line 1294
    :pswitch_59
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v3

    .line 1298
    move-object/from16 v19, v3

    .line 1299
    .line 1300
    goto :goto_c

    .line 1301
    :pswitch_5a
    sget-object v4, Lt4/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1302
    .line 1303
    invoke-static {v1, v3, v4}, Ls8/e;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v3

    .line 1307
    move-object/from16 v18, v3

    .line 1308
    .line 1309
    goto :goto_c

    .line 1310
    :pswitch_5b
    sget-object v4, Lt4/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1311
    .line 1312
    invoke-static {v1, v3, v4}, Ls8/e;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v3

    .line 1316
    move-object/from16 v17, v3

    .line 1317
    .line 1318
    goto :goto_c

    .line 1319
    :pswitch_5c
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v3

    .line 1323
    move-object/from16 v16, v3

    .line 1324
    .line 1325
    goto :goto_c

    .line 1326
    :pswitch_5d
    sget-object v4, Lt4/q;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1327
    .line 1328
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v3

    .line 1332
    check-cast v3, Lt4/q;

    .line 1333
    .line 1334
    move-object v15, v3

    .line 1335
    goto :goto_c

    .line 1336
    :pswitch_5e
    sget-object v4, Lcom/google/android/gms/cast/MediaTrack;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1337
    .line 1338
    invoke-static {v1, v3, v4}, Ls8/e;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v3

    .line 1342
    move-object v14, v3

    .line 1343
    goto :goto_c

    .line 1344
    :pswitch_5f
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1345
    .line 1346
    .line 1347
    move-result-wide v3

    .line 1348
    move-wide v12, v3

    .line 1349
    goto :goto_c

    .line 1350
    :pswitch_60
    sget-object v4, Lt4/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1351
    .line 1352
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v3

    .line 1356
    check-cast v3, Lt4/k;

    .line 1357
    .line 1358
    move-object v11, v3

    .line 1359
    goto/16 :goto_c

    .line 1360
    .line 1361
    :pswitch_61
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v3

    .line 1365
    move-object v10, v3

    .line 1366
    goto/16 :goto_c

    .line 1367
    .line 1368
    :pswitch_62
    invoke-static {v1, v3}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1369
    .line 1370
    .line 1371
    move-result v3

    .line 1372
    move v9, v3

    .line 1373
    goto/16 :goto_c

    .line 1374
    .line 1375
    :pswitch_63
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v3

    .line 1379
    move-object v8, v3

    .line 1380
    goto/16 :goto_c

    .line 1381
    .line 1382
    :cond_22
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1383
    .line 1384
    .line 1385
    new-instance v7, Lcom/google/android/gms/cast/MediaInfo;

    .line 1386
    .line 1387
    invoke-direct/range {v7 .. v26}, Lcom/google/android/gms/cast/MediaInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Lt4/k;JLjava/util/ArrayList;Lt4/q;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Lt4/r;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1388
    .line 1389
    .line 1390
    return-object v7

    .line 1391
    :pswitch_64
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1392
    .line 1393
    .line 1394
    move-result v2

    .line 1395
    const/4 v3, 0x0

    .line 1396
    const-wide/16 v4, 0x0

    .line 1397
    .line 1398
    move-object v7, v3

    .line 1399
    move-object v10, v7

    .line 1400
    move-object v11, v10

    .line 1401
    move-wide v8, v4

    .line 1402
    move-object v4, v11

    .line 1403
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1404
    .line 1405
    .line 1406
    move-result v5

    .line 1407
    if-ge v5, v2, :cond_29

    .line 1408
    .line 1409
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1410
    .line 1411
    .line 1412
    move-result v5

    .line 1413
    int-to-char v6, v5

    .line 1414
    const/4 v12, 0x2

    .line 1415
    if-eq v6, v12, :cond_28

    .line 1416
    .line 1417
    const/4 v12, 0x3

    .line 1418
    if-eq v6, v12, :cond_27

    .line 1419
    .line 1420
    const/4 v12, 0x4

    .line 1421
    if-eq v6, v12, :cond_25

    .line 1422
    .line 1423
    const/4 v12, 0x5

    .line 1424
    if-eq v6, v12, :cond_24

    .line 1425
    .line 1426
    const/4 v12, 0x6

    .line 1427
    if-eq v6, v12, :cond_23

    .line 1428
    .line 1429
    invoke-static {v1, v5}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1430
    .line 1431
    .line 1432
    goto :goto_d

    .line 1433
    :cond_23
    invoke-static {v1, v5}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v4

    .line 1437
    goto :goto_d

    .line 1438
    :cond_24
    invoke-static {v1, v5}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v11

    .line 1442
    goto :goto_d

    .line 1443
    :cond_25
    invoke-static {v1, v5}, Ls8/e;->V(Landroid/os/Parcel;I)I

    .line 1444
    .line 1445
    .line 1446
    move-result v5

    .line 1447
    if-nez v5, :cond_26

    .line 1448
    .line 1449
    move-object v10, v3

    .line 1450
    goto :goto_d

    .line 1451
    :cond_26
    invoke-static {v1, v5, v12}, Ls8/e;->i0(Landroid/os/Parcel;II)V

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1455
    .line 1456
    .line 1457
    move-result v5

    .line 1458
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v5

    .line 1462
    move-object v10, v5

    .line 1463
    goto :goto_d

    .line 1464
    :cond_27
    invoke-static {v1, v5}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1465
    .line 1466
    .line 1467
    move-result-wide v5

    .line 1468
    move-wide v8, v5

    .line 1469
    goto :goto_d

    .line 1470
    :cond_28
    invoke-static {v1, v5}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v7

    .line 1474
    goto :goto_d

    .line 1475
    :cond_29
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1476
    .line 1477
    .line 1478
    new-instance v6, Lcom/google/android/gms/cast/MediaError;

    .line 1479
    .line 1480
    invoke-static {v4}, Ly4/a;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v12

    .line 1484
    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/cast/MediaError;-><init>(Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 1485
    .line 1486
    .line 1487
    return-object v6

    .line 1488
    :pswitch_65
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1489
    .line 1490
    .line 1491
    move-result v2

    .line 1492
    const/4 v3, 0x0

    .line 1493
    const/4 v4, 0x0

    .line 1494
    move v5, v4

    .line 1495
    move v6, v5

    .line 1496
    move-object v4, v3

    .line 1497
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1498
    .line 1499
    .line 1500
    move-result v7

    .line 1501
    if-ge v7, v2, :cond_2e

    .line 1502
    .line 1503
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1504
    .line 1505
    .line 1506
    move-result v7

    .line 1507
    int-to-char v8, v7

    .line 1508
    const/4 v9, 0x2

    .line 1509
    if-eq v8, v9, :cond_2d

    .line 1510
    .line 1511
    const/4 v9, 0x3

    .line 1512
    if-eq v8, v9, :cond_2c

    .line 1513
    .line 1514
    const/4 v9, 0x4

    .line 1515
    if-eq v8, v9, :cond_2b

    .line 1516
    .line 1517
    const/4 v9, 0x5

    .line 1518
    if-eq v8, v9, :cond_2a

    .line 1519
    .line 1520
    invoke-static {v1, v7}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1521
    .line 1522
    .line 1523
    goto :goto_e

    .line 1524
    :cond_2a
    sget-object v4, Lt4/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1525
    .line 1526
    invoke-static {v1, v7, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v4

    .line 1530
    check-cast v4, Lt4/h;

    .line 1531
    .line 1532
    goto :goto_e

    .line 1533
    :cond_2b
    invoke-static {v1, v7}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 1534
    .line 1535
    .line 1536
    move-result v6

    .line 1537
    goto :goto_e

    .line 1538
    :cond_2c
    invoke-static {v1, v7}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v3

    .line 1542
    goto :goto_e

    .line 1543
    :cond_2d
    invoke-static {v1, v7}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 1544
    .line 1545
    .line 1546
    move-result v5

    .line 1547
    goto :goto_e

    .line 1548
    :cond_2e
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1549
    .line 1550
    .line 1551
    new-instance v1, Lt4/i;

    .line 1552
    .line 1553
    invoke-direct {v1, v5, v3, v6, v4}, Lt4/i;-><init>(ZLjava/lang/String;ZLt4/h;)V

    .line 1554
    .line 1555
    .line 1556
    return-object v1

    .line 1557
    :pswitch_66
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1558
    .line 1559
    .line 1560
    move-result v2

    .line 1561
    const/4 v3, 0x0

    .line 1562
    const/4 v4, 0x0

    .line 1563
    const-wide/16 v5, 0x0

    .line 1564
    .line 1565
    move v13, v3

    .line 1566
    move v15, v13

    .line 1567
    move/from16 v16, v15

    .line 1568
    .line 1569
    move-object v10, v4

    .line 1570
    move-object v14, v10

    .line 1571
    move-wide v8, v5

    .line 1572
    move-wide v11, v8

    .line 1573
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1574
    .line 1575
    .line 1576
    move-result v3

    .line 1577
    if-ge v3, v2, :cond_30

    .line 1578
    .line 1579
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1580
    .line 1581
    .line 1582
    move-result v3

    .line 1583
    int-to-char v5, v3

    .line 1584
    packed-switch v5, :pswitch_data_8

    .line 1585
    .line 1586
    .line 1587
    invoke-static {v1, v3}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1588
    .line 1589
    .line 1590
    goto :goto_f

    .line 1591
    :pswitch_67
    invoke-static {v1, v3}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 1592
    .line 1593
    .line 1594
    move-result v3

    .line 1595
    move/from16 v16, v3

    .line 1596
    .line 1597
    goto :goto_f

    .line 1598
    :pswitch_68
    invoke-static {v1, v3}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 1599
    .line 1600
    .line 1601
    move-result v3

    .line 1602
    move v15, v3

    .line 1603
    goto :goto_f

    .line 1604
    :pswitch_69
    invoke-static {v1, v3}, Ls8/e;->V(Landroid/os/Parcel;I)I

    .line 1605
    .line 1606
    .line 1607
    move-result v3

    .line 1608
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1609
    .line 1610
    .line 1611
    move-result v5

    .line 1612
    if-nez v3, :cond_2f

    .line 1613
    .line 1614
    move-object v14, v4

    .line 1615
    goto :goto_f

    .line 1616
    :cond_2f
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v6

    .line 1620
    add-int/2addr v5, v3

    .line 1621
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1622
    .line 1623
    .line 1624
    move-object v14, v6

    .line 1625
    goto :goto_f

    .line 1626
    :pswitch_6a
    invoke-static {v1, v3}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 1627
    .line 1628
    .line 1629
    move-result v3

    .line 1630
    move v13, v3

    .line 1631
    goto :goto_f

    .line 1632
    :pswitch_6b
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1633
    .line 1634
    .line 1635
    move-result-wide v5

    .line 1636
    move-wide v11, v5

    .line 1637
    goto :goto_f

    .line 1638
    :pswitch_6c
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v10

    .line 1642
    goto :goto_f

    .line 1643
    :pswitch_6d
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1644
    .line 1645
    .line 1646
    move-result-wide v5

    .line 1647
    move-wide v8, v5

    .line 1648
    goto :goto_f

    .line 1649
    :cond_30
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1650
    .line 1651
    .line 1652
    new-instance v7, Lt4/b;

    .line 1653
    .line 1654
    invoke-direct/range {v7 .. v16}, Lt4/b;-><init>(JLjava/lang/String;JZ[Ljava/lang/String;ZZ)V

    .line 1655
    .line 1656
    .line 1657
    return-object v7

    .line 1658
    :pswitch_6e
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1659
    .line 1660
    .line 1661
    move-result v2

    .line 1662
    const/4 v3, 0x0

    .line 1663
    move-object v4, v3

    .line 1664
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1665
    .line 1666
    .line 1667
    move-result v5

    .line 1668
    if-ge v5, v2, :cond_33

    .line 1669
    .line 1670
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1671
    .line 1672
    .line 1673
    move-result v5

    .line 1674
    int-to-char v6, v5

    .line 1675
    const/4 v7, 0x2

    .line 1676
    if-eq v6, v7, :cond_32

    .line 1677
    .line 1678
    const/4 v7, 0x3

    .line 1679
    if-eq v6, v7, :cond_31

    .line 1680
    .line 1681
    invoke-static {v1, v5}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1682
    .line 1683
    .line 1684
    goto :goto_10

    .line 1685
    :cond_31
    sget-object v4, Lt4/t;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1686
    .line 1687
    invoke-static {v1, v5, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v4

    .line 1691
    check-cast v4, Lt4/t;

    .line 1692
    .line 1693
    goto :goto_10

    .line 1694
    :cond_32
    sget-object v3, Lt4/t;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1695
    .line 1696
    invoke-static {v1, v5, v3}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v3

    .line 1700
    check-cast v3, Lt4/t;

    .line 1701
    .line 1702
    goto :goto_10

    .line 1703
    :cond_33
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1704
    .line 1705
    .line 1706
    new-instance v1, Lt4/u;

    .line 1707
    .line 1708
    invoke-direct {v1, v3, v4}, Lt4/u;-><init>(Lt4/t;Lt4/t;)V

    .line 1709
    .line 1710
    .line 1711
    return-object v1

    .line 1712
    :pswitch_6f
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1713
    .line 1714
    .line 1715
    move-result v2

    .line 1716
    const/4 v3, 0x0

    .line 1717
    move v4, v3

    .line 1718
    move v5, v4

    .line 1719
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1720
    .line 1721
    .line 1722
    move-result v6

    .line 1723
    if-ge v6, v2, :cond_37

    .line 1724
    .line 1725
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1726
    .line 1727
    .line 1728
    move-result v6

    .line 1729
    int-to-char v7, v6

    .line 1730
    const/4 v8, 0x2

    .line 1731
    const/4 v9, 0x4

    .line 1732
    if-eq v7, v8, :cond_36

    .line 1733
    .line 1734
    const/4 v8, 0x3

    .line 1735
    if-eq v7, v8, :cond_35

    .line 1736
    .line 1737
    if-eq v7, v9, :cond_34

    .line 1738
    .line 1739
    invoke-static {v1, v6}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1740
    .line 1741
    .line 1742
    goto :goto_11

    .line 1743
    :cond_34
    invoke-static {v1, v6, v9}, Ls8/e;->k0(Landroid/os/Parcel;II)V

    .line 1744
    .line 1745
    .line 1746
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 1747
    .line 1748
    .line 1749
    move-result v5

    .line 1750
    goto :goto_11

    .line 1751
    :cond_35
    invoke-static {v1, v6, v9}, Ls8/e;->k0(Landroid/os/Parcel;II)V

    .line 1752
    .line 1753
    .line 1754
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 1755
    .line 1756
    .line 1757
    move-result v4

    .line 1758
    goto :goto_11

    .line 1759
    :cond_36
    invoke-static {v1, v6, v9}, Ls8/e;->k0(Landroid/os/Parcel;II)V

    .line 1760
    .line 1761
    .line 1762
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 1763
    .line 1764
    .line 1765
    move-result v3

    .line 1766
    goto :goto_11

    .line 1767
    :cond_37
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1768
    .line 1769
    .line 1770
    new-instance v1, Lt4/t;

    .line 1771
    .line 1772
    invoke-direct {v1, v3, v4, v5}, Lt4/t;-><init>(FFF)V

    .line 1773
    .line 1774
    .line 1775
    return-object v1

    .line 1776
    :pswitch_70
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1777
    .line 1778
    .line 1779
    move-result v2

    .line 1780
    const/4 v3, 0x0

    .line 1781
    move-object v4, v3

    .line 1782
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1783
    .line 1784
    .line 1785
    move-result v5

    .line 1786
    if-ge v5, v2, :cond_3a

    .line 1787
    .line 1788
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1789
    .line 1790
    .line 1791
    move-result v5

    .line 1792
    int-to-char v6, v5

    .line 1793
    const/4 v7, 0x1

    .line 1794
    if-eq v6, v7, :cond_39

    .line 1795
    .line 1796
    const/4 v7, 0x2

    .line 1797
    if-eq v6, v7, :cond_38

    .line 1798
    .line 1799
    invoke-static {v1, v5}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1800
    .line 1801
    .line 1802
    goto :goto_12

    .line 1803
    :cond_38
    invoke-static {v1, v5}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v4

    .line 1807
    goto :goto_12

    .line 1808
    :cond_39
    invoke-static {v1, v5}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v3

    .line 1812
    goto :goto_12

    .line 1813
    :cond_3a
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1814
    .line 1815
    .line 1816
    new-instance v1, Lt4/h;

    .line 1817
    .line 1818
    invoke-direct {v1, v3, v4}, Lt4/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1819
    .line 1820
    .line 1821
    return-object v1

    .line 1822
    :pswitch_71
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1823
    .line 1824
    .line 1825
    move-result v2

    .line 1826
    const/4 v3, 0x0

    .line 1827
    const-wide/16 v4, 0x0

    .line 1828
    .line 1829
    move-object v7, v3

    .line 1830
    move-object v8, v7

    .line 1831
    move-object v11, v8

    .line 1832
    move-object v12, v11

    .line 1833
    move-object v13, v12

    .line 1834
    move-object v14, v13

    .line 1835
    move-object v15, v14

    .line 1836
    move-object/from16 v16, v15

    .line 1837
    .line 1838
    move-object/from16 v19, v16

    .line 1839
    .line 1840
    move-object/from16 v20, v19

    .line 1841
    .line 1842
    move-wide v9, v4

    .line 1843
    move-wide/from16 v17, v9

    .line 1844
    .line 1845
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1846
    .line 1847
    .line 1848
    move-result v3

    .line 1849
    if-ge v3, v2, :cond_3b

    .line 1850
    .line 1851
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1852
    .line 1853
    .line 1854
    move-result v3

    .line 1855
    int-to-char v4, v3

    .line 1856
    packed-switch v4, :pswitch_data_9

    .line 1857
    .line 1858
    .line 1859
    invoke-static {v1, v3}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1860
    .line 1861
    .line 1862
    goto :goto_13

    .line 1863
    :pswitch_72
    sget-object v4, Lt4/r;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1864
    .line 1865
    invoke-static {v1, v3, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v3

    .line 1869
    check-cast v3, Lt4/r;

    .line 1870
    .line 1871
    move-object/from16 v20, v3

    .line 1872
    .line 1873
    goto :goto_13

    .line 1874
    :pswitch_73
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v3

    .line 1878
    move-object/from16 v19, v3

    .line 1879
    .line 1880
    goto :goto_13

    .line 1881
    :pswitch_74
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1882
    .line 1883
    .line 1884
    move-result-wide v3

    .line 1885
    move-wide/from16 v17, v3

    .line 1886
    .line 1887
    goto :goto_13

    .line 1888
    :pswitch_75
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v3

    .line 1892
    move-object/from16 v16, v3

    .line 1893
    .line 1894
    goto :goto_13

    .line 1895
    :pswitch_76
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v3

    .line 1899
    move-object v15, v3

    .line 1900
    goto :goto_13

    .line 1901
    :pswitch_77
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v3

    .line 1905
    move-object v14, v3

    .line 1906
    goto :goto_13

    .line 1907
    :pswitch_78
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v3

    .line 1911
    move-object v13, v3

    .line 1912
    goto :goto_13

    .line 1913
    :pswitch_79
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v3

    .line 1917
    move-object v12, v3

    .line 1918
    goto :goto_13

    .line 1919
    :pswitch_7a
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v3

    .line 1923
    move-object v11, v3

    .line 1924
    goto :goto_13

    .line 1925
    :pswitch_7b
    invoke-static {v1, v3}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1926
    .line 1927
    .line 1928
    move-result-wide v3

    .line 1929
    move-wide v9, v3

    .line 1930
    goto :goto_13

    .line 1931
    :pswitch_7c
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v3

    .line 1935
    move-object v8, v3

    .line 1936
    goto :goto_13

    .line 1937
    :pswitch_7d
    invoke-static {v1, v3}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v3

    .line 1941
    move-object v7, v3

    .line 1942
    goto :goto_13

    .line 1943
    :cond_3b
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1944
    .line 1945
    .line 1946
    new-instance v6, Lt4/a;

    .line 1947
    .line 1948
    invoke-direct/range {v6 .. v20}, Lt4/a;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lt4/r;)V

    .line 1949
    .line 1950
    .line 1951
    return-object v6

    .line 1952
    :pswitch_7e
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1953
    .line 1954
    .line 1955
    move-result v2

    .line 1956
    const/4 v3, 0x0

    .line 1957
    move-object v4, v3

    .line 1958
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1959
    .line 1960
    .line 1961
    move-result v5

    .line 1962
    if-ge v5, v2, :cond_3e

    .line 1963
    .line 1964
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1965
    .line 1966
    .line 1967
    move-result v5

    .line 1968
    int-to-char v6, v5

    .line 1969
    const/4 v7, 0x2

    .line 1970
    if-eq v6, v7, :cond_3d

    .line 1971
    .line 1972
    const/4 v7, 0x5

    .line 1973
    if-eq v6, v7, :cond_3c

    .line 1974
    .line 1975
    invoke-static {v1, v5}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1976
    .line 1977
    .line 1978
    goto :goto_14

    .line 1979
    :cond_3c
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1980
    .line 1981
    invoke-static {v1, v5, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v4

    .line 1985
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 1986
    .line 1987
    goto :goto_14

    .line 1988
    :cond_3d
    invoke-static {v1, v5}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v3

    .line 1992
    goto :goto_14

    .line 1993
    :cond_3e
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1994
    .line 1995
    .line 1996
    new-instance v1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 1997
    .line 1998
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 1999
    .line 2000
    .line 2001
    return-object v1

    .line 2002
    :pswitch_7f
    invoke-static {v1}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 2003
    .line 2004
    .line 2005
    move-result v2

    .line 2006
    const/4 v3, 0x0

    .line 2007
    const/4 v4, 0x0

    .line 2008
    move v5, v4

    .line 2009
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2010
    .line 2011
    .line 2012
    move-result v6

    .line 2013
    if-ge v6, v2, :cond_42

    .line 2014
    .line 2015
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2016
    .line 2017
    .line 2018
    move-result v6

    .line 2019
    int-to-char v7, v6

    .line 2020
    const/4 v8, 0x1

    .line 2021
    if-eq v7, v8, :cond_41

    .line 2022
    .line 2023
    const/4 v8, 0x2

    .line 2024
    if-eq v7, v8, :cond_40

    .line 2025
    .line 2026
    const/4 v8, 0x3

    .line 2027
    if-eq v7, v8, :cond_3f

    .line 2028
    .line 2029
    invoke-static {v1, v6}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 2030
    .line 2031
    .line 2032
    goto :goto_15

    .line 2033
    :cond_3f
    invoke-static {v1, v6}, Ls8/e;->i(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v3

    .line 2037
    goto :goto_15

    .line 2038
    :cond_40
    invoke-static {v1, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 2039
    .line 2040
    .line 2041
    move-result v5

    .line 2042
    goto :goto_15

    .line 2043
    :cond_41
    invoke-static {v1, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 2044
    .line 2045
    .line 2046
    move-result v4

    .line 2047
    goto :goto_15

    .line 2048
    :cond_42
    invoke-static {v1, v2}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 2049
    .line 2050
    .line 2051
    new-instance v1, Ls4/a;

    .line 2052
    .line 2053
    invoke-direct {v1, v4, v5, v3}, Ls4/a;-><init>(IILandroid/os/Bundle;)V

    .line 2054
    .line 2055
    .line 2056
    return-object v1

    .line 2057
    :pswitch_80
    new-instance v2, Lp5/a;

    .line 2058
    .line 2059
    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 2060
    .line 2061
    .line 2062
    const-class v3, Lp5/a;

    .line 2063
    .line 2064
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v3

    .line 2068
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 2069
    .line 2070
    .line 2071
    move-result-object v1

    .line 2072
    check-cast v1, Ljava/lang/Integer;

    .line 2073
    .line 2074
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2075
    .line 2076
    .line 2077
    move-result v1

    .line 2078
    iput v1, v2, Lp5/a;->a:I

    .line 2079
    .line 2080
    return-object v2

    .line 2081
    :pswitch_81
    new-instance v2, Lp/J;

    .line 2082
    .line 2083
    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 2084
    .line 2085
    .line 2086
    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    .line 2087
    .line 2088
    .line 2089
    move-result v1

    .line 2090
    if-eqz v1, :cond_43

    .line 2091
    .line 2092
    const/4 v1, 0x1

    .line 2093
    goto :goto_16

    .line 2094
    :cond_43
    const/4 v1, 0x0

    .line 2095
    :goto_16
    iput-boolean v1, v2, Lp/J;->a:Z

    .line 2096
    .line 2097
    return-object v2

    .line 2098
    :pswitch_82
    new-instance v2, Lp/k;

    .line 2099
    .line 2100
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 2101
    .line 2102
    .line 2103
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2104
    .line 2105
    .line 2106
    move-result v1

    .line 2107
    iput v1, v2, Lp/k;->a:I

    .line 2108
    .line 2109
    return-object v2

    .line 2110
    :pswitch_83
    new-instance v2, Lo4/f;

    .line 2111
    .line 2112
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 2113
    .line 2114
    .line 2115
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2116
    .line 2117
    .line 2118
    move-result v3

    .line 2119
    iput v3, v2, Lo4/f;->a:I

    .line 2120
    .line 2121
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2122
    .line 2123
    .line 2124
    move-result v1

    .line 2125
    iput v1, v2, Lo4/f;->b:I

    .line 2126
    .line 2127
    return-object v2

    .line 2128
    :pswitch_84
    new-instance v2, Lo4/d;

    .line 2129
    .line 2130
    const/4 v3, -0x2

    .line 2131
    invoke-direct {v2, v3, v3}, LF0/c0;-><init>(II)V

    .line 2132
    .line 2133
    .line 2134
    const/4 v3, 0x0

    .line 2135
    iput v3, v2, Lo4/d;->e:F

    .line 2136
    .line 2137
    const/high16 v3, 0x3f800000    # 1.0f

    .line 2138
    .line 2139
    iput v3, v2, Lo4/d;->f:F

    .line 2140
    .line 2141
    const/4 v3, -0x1

    .line 2142
    iput v3, v2, Lo4/d;->g:I

    .line 2143
    .line 2144
    const/high16 v3, -0x40800000    # -1.0f

    .line 2145
    .line 2146
    iput v3, v2, Lo4/d;->h:F

    .line 2147
    .line 2148
    const v3, 0xffffff

    .line 2149
    .line 2150
    .line 2151
    iput v3, v2, Lo4/d;->k:I

    .line 2152
    .line 2153
    iput v3, v2, Lo4/d;->l:I

    .line 2154
    .line 2155
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 2156
    .line 2157
    .line 2158
    move-result v3

    .line 2159
    iput v3, v2, Lo4/d;->e:F

    .line 2160
    .line 2161
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 2162
    .line 2163
    .line 2164
    move-result v3

    .line 2165
    iput v3, v2, Lo4/d;->f:F

    .line 2166
    .line 2167
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2168
    .line 2169
    .line 2170
    move-result v3

    .line 2171
    iput v3, v2, Lo4/d;->g:I

    .line 2172
    .line 2173
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 2174
    .line 2175
    .line 2176
    move-result v3

    .line 2177
    iput v3, v2, Lo4/d;->h:F

    .line 2178
    .line 2179
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2180
    .line 2181
    .line 2182
    move-result v3

    .line 2183
    iput v3, v2, Lo4/d;->i:I

    .line 2184
    .line 2185
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2186
    .line 2187
    .line 2188
    move-result v3

    .line 2189
    iput v3, v2, Lo4/d;->j:I

    .line 2190
    .line 2191
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2192
    .line 2193
    .line 2194
    move-result v3

    .line 2195
    iput v3, v2, Lo4/d;->k:I

    .line 2196
    .line 2197
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2198
    .line 2199
    .line 2200
    move-result v3

    .line 2201
    iput v3, v2, Lo4/d;->l:I

    .line 2202
    .line 2203
    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    .line 2204
    .line 2205
    .line 2206
    move-result v3

    .line 2207
    if-eqz v3, :cond_44

    .line 2208
    .line 2209
    const/4 v3, 0x1

    .line 2210
    goto :goto_17

    .line 2211
    :cond_44
    const/4 v3, 0x0

    .line 2212
    :goto_17
    iput-boolean v3, v2, Lo4/d;->m:Z

    .line 2213
    .line 2214
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2215
    .line 2216
    .line 2217
    move-result v3

    .line 2218
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 2219
    .line 2220
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2221
    .line 2222
    .line 2223
    move-result v3

    .line 2224
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 2225
    .line 2226
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2227
    .line 2228
    .line 2229
    move-result v3

    .line 2230
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 2231
    .line 2232
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2233
    .line 2234
    .line 2235
    move-result v3

    .line 2236
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 2237
    .line 2238
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2239
    .line 2240
    .line 2241
    move-result v3

    .line 2242
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 2243
    .line 2244
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2245
    .line 2246
    .line 2247
    move-result v1

    .line 2248
    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 2249
    .line 2250
    return-object v2

    .line 2251
    :pswitch_85
    new-instance v2, Ln3/f;

    .line 2252
    .line 2253
    invoke-direct {v2, v1}, Ln3/f;-><init>(Landroid/os/Parcel;)V

    .line 2254
    .line 2255
    .line 2256
    return-object v2

    .line 2257
    :pswitch_86
    new-instance v2, Ln3/g;

    .line 2258
    .line 2259
    invoke-direct {v2, v1}, Ln3/g;-><init>(Landroid/os/Parcel;)V

    .line 2260
    .line 2261
    .line 2262
    return-object v2

    .line 2263
    :pswitch_87
    new-instance v2, Li5/c;

    .line 2264
    .line 2265
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 2266
    .line 2267
    .line 2268
    const/16 v3, 0xff

    .line 2269
    .line 2270
    iput v3, v2, Li5/c;->i:I

    .line 2271
    .line 2272
    const/4 v3, -0x2

    .line 2273
    iput v3, v2, Li5/c;->k:I

    .line 2274
    .line 2275
    iput v3, v2, Li5/c;->l:I

    .line 2276
    .line 2277
    iput v3, v2, Li5/c;->m:I

    .line 2278
    .line 2279
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2280
    .line 2281
    iput-object v3, v2, Li5/c;->t:Ljava/lang/Boolean;

    .line 2282
    .line 2283
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2284
    .line 2285
    .line 2286
    move-result v3

    .line 2287
    iput v3, v2, Li5/c;->a:I

    .line 2288
    .line 2289
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v3

    .line 2293
    check-cast v3, Ljava/lang/Integer;

    .line 2294
    .line 2295
    iput-object v3, v2, Li5/c;->b:Ljava/lang/Integer;

    .line 2296
    .line 2297
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2298
    .line 2299
    .line 2300
    move-result-object v3

    .line 2301
    check-cast v3, Ljava/lang/Integer;

    .line 2302
    .line 2303
    iput-object v3, v2, Li5/c;->c:Ljava/lang/Integer;

    .line 2304
    .line 2305
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v3

    .line 2309
    check-cast v3, Ljava/lang/Integer;

    .line 2310
    .line 2311
    iput-object v3, v2, Li5/c;->d:Ljava/lang/Integer;

    .line 2312
    .line 2313
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2314
    .line 2315
    .line 2316
    move-result-object v3

    .line 2317
    check-cast v3, Ljava/lang/Integer;

    .line 2318
    .line 2319
    iput-object v3, v2, Li5/c;->e:Ljava/lang/Integer;

    .line 2320
    .line 2321
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v3

    .line 2325
    check-cast v3, Ljava/lang/Integer;

    .line 2326
    .line 2327
    iput-object v3, v2, Li5/c;->f:Ljava/lang/Integer;

    .line 2328
    .line 2329
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v3

    .line 2333
    check-cast v3, Ljava/lang/Integer;

    .line 2334
    .line 2335
    iput-object v3, v2, Li5/c;->g:Ljava/lang/Integer;

    .line 2336
    .line 2337
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2338
    .line 2339
    .line 2340
    move-result-object v3

    .line 2341
    check-cast v3, Ljava/lang/Integer;

    .line 2342
    .line 2343
    iput-object v3, v2, Li5/c;->h:Ljava/lang/Integer;

    .line 2344
    .line 2345
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2346
    .line 2347
    .line 2348
    move-result v3

    .line 2349
    iput v3, v2, Li5/c;->i:I

    .line 2350
    .line 2351
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 2352
    .line 2353
    .line 2354
    move-result-object v3

    .line 2355
    iput-object v3, v2, Li5/c;->j:Ljava/lang/String;

    .line 2356
    .line 2357
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2358
    .line 2359
    .line 2360
    move-result v3

    .line 2361
    iput v3, v2, Li5/c;->k:I

    .line 2362
    .line 2363
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2364
    .line 2365
    .line 2366
    move-result v3

    .line 2367
    iput v3, v2, Li5/c;->l:I

    .line 2368
    .line 2369
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2370
    .line 2371
    .line 2372
    move-result v3

    .line 2373
    iput v3, v2, Li5/c;->m:I

    .line 2374
    .line 2375
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 2376
    .line 2377
    .line 2378
    move-result-object v3

    .line 2379
    iput-object v3, v2, Li5/c;->o:Ljava/lang/String;

    .line 2380
    .line 2381
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 2382
    .line 2383
    .line 2384
    move-result-object v3

    .line 2385
    iput-object v3, v2, Li5/c;->p:Ljava/lang/CharSequence;

    .line 2386
    .line 2387
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2388
    .line 2389
    .line 2390
    move-result v3

    .line 2391
    iput v3, v2, Li5/c;->q:I

    .line 2392
    .line 2393
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2394
    .line 2395
    .line 2396
    move-result-object v3

    .line 2397
    check-cast v3, Ljava/lang/Integer;

    .line 2398
    .line 2399
    iput-object v3, v2, Li5/c;->s:Ljava/lang/Integer;

    .line 2400
    .line 2401
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v3

    .line 2405
    check-cast v3, Ljava/lang/Integer;

    .line 2406
    .line 2407
    iput-object v3, v2, Li5/c;->u:Ljava/lang/Integer;

    .line 2408
    .line 2409
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v3

    .line 2413
    check-cast v3, Ljava/lang/Integer;

    .line 2414
    .line 2415
    iput-object v3, v2, Li5/c;->v:Ljava/lang/Integer;

    .line 2416
    .line 2417
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2418
    .line 2419
    .line 2420
    move-result-object v3

    .line 2421
    check-cast v3, Ljava/lang/Integer;

    .line 2422
    .line 2423
    iput-object v3, v2, Li5/c;->w:Ljava/lang/Integer;

    .line 2424
    .line 2425
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2426
    .line 2427
    .line 2428
    move-result-object v3

    .line 2429
    check-cast v3, Ljava/lang/Integer;

    .line 2430
    .line 2431
    iput-object v3, v2, Li5/c;->x:Ljava/lang/Integer;

    .line 2432
    .line 2433
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2434
    .line 2435
    .line 2436
    move-result-object v3

    .line 2437
    check-cast v3, Ljava/lang/Integer;

    .line 2438
    .line 2439
    iput-object v3, v2, Li5/c;->y:Ljava/lang/Integer;

    .line 2440
    .line 2441
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2442
    .line 2443
    .line 2444
    move-result-object v3

    .line 2445
    check-cast v3, Ljava/lang/Integer;

    .line 2446
    .line 2447
    iput-object v3, v2, Li5/c;->z:Ljava/lang/Integer;

    .line 2448
    .line 2449
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v3

    .line 2453
    check-cast v3, Ljava/lang/Integer;

    .line 2454
    .line 2455
    iput-object v3, v2, Li5/c;->C:Ljava/lang/Integer;

    .line 2456
    .line 2457
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2458
    .line 2459
    .line 2460
    move-result-object v3

    .line 2461
    check-cast v3, Ljava/lang/Integer;

    .line 2462
    .line 2463
    iput-object v3, v2, Li5/c;->A:Ljava/lang/Integer;

    .line 2464
    .line 2465
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v3

    .line 2469
    check-cast v3, Ljava/lang/Integer;

    .line 2470
    .line 2471
    iput-object v3, v2, Li5/c;->B:Ljava/lang/Integer;

    .line 2472
    .line 2473
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v3

    .line 2477
    check-cast v3, Ljava/lang/Boolean;

    .line 2478
    .line 2479
    iput-object v3, v2, Li5/c;->t:Ljava/lang/Boolean;

    .line 2480
    .line 2481
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2482
    .line 2483
    .line 2484
    move-result-object v3

    .line 2485
    check-cast v3, Ljava/util/Locale;

    .line 2486
    .line 2487
    iput-object v3, v2, Li5/c;->n:Ljava/util/Locale;

    .line 2488
    .line 2489
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 2490
    .line 2491
    .line 2492
    move-result-object v1

    .line 2493
    check-cast v1, Ljava/lang/Boolean;

    .line 2494
    .line 2495
    iput-object v1, v2, Li5/c;->D:Ljava/lang/Boolean;

    .line 2496
    .line 2497
    return-object v2

    .line 2498
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_43
        :pswitch_3a
        :pswitch_24
        :pswitch_1a
        :pswitch_e
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
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
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
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
        :pswitch_f
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x2
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x2
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x2
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x2
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x2
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Li5/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lt4/s;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lt4/r;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lt4/q;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lt4/d;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lcom/google/android/gms/cast/MediaTrack;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lt4/p;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lt4/n;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lt4/m;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lt4/l;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lt4/k;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lt4/c;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lt4/j;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lcom/google/android/gms/cast/MediaInfo;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Lcom/google/android/gms/cast/MediaError;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lt4/i;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Lt4/b;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Lt4/u;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Lt4/t;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lt4/h;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lt4/a;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Ls4/a;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Lp5/a;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Lp/J;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lp/k;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Lo4/f;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [Lo4/d;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [Ln3/f;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [Ln3/g;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [Li5/c;

    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    :pswitch_data_0
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
.end method
