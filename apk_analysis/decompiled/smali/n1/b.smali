.class public final Ln1/b;
.super LG0/H;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LG0/E;I)V
    .locals 0

    .line 1
    iput p2, p0, Ln1/b;->d:I

    invoke-direct {p0, p1}, LG0/H;-><init>(LG0/E;)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ln1/b;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_2
    const-string v0, "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_3
    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)"

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_4
    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_5
    const-string v0, "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)"

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final k(LR0/j;Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    iget v0, v2, Ln1/b;->d:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v0, p2

    .line 11
    .line 12
    check-cast v0, Ln1/k;

    .line 13
    .line 14
    iget-object v3, v0, Ln1/k;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-interface {v1, v4}, LQ0/e;->t(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-interface {v1, v4, v3}, LQ0/e;->m(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 v3, 0x2

    .line 27
    iget-object v0, v0, Ln1/k;->b:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-interface {v1, v3}, LQ0/e;->t(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-interface {v1, v3, v0}, LQ0/e;->m(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    return-void

    .line 39
    :pswitch_0
    move-object/from16 v0, p2

    .line 40
    .line 41
    check-cast v0, Ln1/j;

    .line 42
    .line 43
    iget-object v3, v0, Ln1/j;->a:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    invoke-interface {v1, v4}, LQ0/e;->t(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-interface {v1, v4, v3}, LQ0/e;->m(ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :goto_2
    iget v3, v0, Ln1/j;->b:I

    .line 56
    .line 57
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/D1;->K(I)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    int-to-long v5, v3

    .line 62
    const/4 v3, 0x2

    .line 63
    invoke-interface {v1, v5, v6, v3}, LQ0/e;->z(JI)V

    .line 64
    .line 65
    .line 66
    iget-object v5, v0, Ln1/j;->c:Ljava/lang/String;

    .line 67
    .line 68
    const/4 v6, 0x3

    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    invoke-interface {v1, v6}, LQ0/e;->t(I)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    invoke-interface {v1, v6, v5}, LQ0/e;->m(ILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :goto_3
    iget-object v5, v0, Ln1/j;->d:Ljava/lang/String;

    .line 79
    .line 80
    const/4 v7, 0x4

    .line 81
    if-nez v5, :cond_4

    .line 82
    .line 83
    invoke-interface {v1, v7}, LQ0/e;->t(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    invoke-interface {v1, v7, v5}, LQ0/e;->m(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :goto_4
    iget-object v5, v0, Ln1/j;->e:Le1/h;

    .line 91
    .line 92
    invoke-static {v5}, Le1/h;->b(Le1/h;)[B

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    const/4 v8, 0x5

    .line 97
    if-nez v5, :cond_5

    .line 98
    .line 99
    invoke-interface {v1, v8}, LQ0/e;->t(I)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_5
    invoke-interface {v1, v8, v5}, LQ0/e;->U(I[B)V

    .line 104
    .line 105
    .line 106
    :goto_5
    iget-object v5, v0, Ln1/j;->f:Le1/h;

    .line 107
    .line 108
    invoke-static {v5}, Le1/h;->b(Le1/h;)[B

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const/4 v9, 0x6

    .line 113
    if-nez v5, :cond_6

    .line 114
    .line 115
    invoke-interface {v1, v9}, LQ0/e;->t(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_6
    invoke-interface {v1, v9, v5}, LQ0/e;->U(I[B)V

    .line 120
    .line 121
    .line 122
    :goto_6
    const/4 v5, 0x7

    .line 123
    iget-wide v10, v0, Ln1/j;->g:J

    .line 124
    .line 125
    invoke-interface {v1, v10, v11, v5}, LQ0/e;->z(JI)V

    .line 126
    .line 127
    .line 128
    const/16 v5, 0x8

    .line 129
    .line 130
    iget-wide v10, v0, Ln1/j;->h:J

    .line 131
    .line 132
    invoke-interface {v1, v10, v11, v5}, LQ0/e;->z(JI)V

    .line 133
    .line 134
    .line 135
    const/16 v5, 0x9

    .line 136
    .line 137
    iget-wide v10, v0, Ln1/j;->i:J

    .line 138
    .line 139
    invoke-interface {v1, v10, v11, v5}, LQ0/e;->z(JI)V

    .line 140
    .line 141
    .line 142
    iget v5, v0, Ln1/j;->k:I

    .line 143
    .line 144
    int-to-long v10, v5

    .line 145
    const/16 v5, 0xa

    .line 146
    .line 147
    invoke-interface {v1, v10, v11, v5}, LQ0/e;->z(JI)V

    .line 148
    .line 149
    .line 150
    iget v5, v0, Ln1/j;->l:I

    .line 151
    .line 152
    invoke-static {v5}, Lw/h;->b(I)I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    const-string v12, " to int"

    .line 157
    .line 158
    const-string v13, "Could not convert "

    .line 159
    .line 160
    if-eqz v10, :cond_a

    .line 161
    .line 162
    if-ne v10, v4, :cond_7

    .line 163
    .line 164
    move v5, v4

    .line 165
    goto :goto_8

    .line 166
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 167
    .line 168
    new-instance v1, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    const/4 v3, 0x1

    .line 174
    if-eq v5, v3, :cond_9

    .line 175
    .line 176
    const/4 v3, 0x2

    .line 177
    if-eq v5, v3, :cond_8

    .line 178
    .line 179
    const-string v3, "null"

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_8
    const-string v3, "LINEAR"

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_9
    const-string v3, "EXPONENTIAL"

    .line 186
    .line 187
    :goto_7
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0

    .line 201
    :cond_a
    const/4 v5, 0x0

    .line 202
    :goto_8
    const/16 v10, 0xb

    .line 203
    .line 204
    int-to-long v14, v5

    .line 205
    invoke-interface {v1, v14, v15, v10}, LQ0/e;->z(JI)V

    .line 206
    .line 207
    .line 208
    const/16 v5, 0xc

    .line 209
    .line 210
    iget-wide v14, v0, Ln1/j;->m:J

    .line 211
    .line 212
    invoke-interface {v1, v14, v15, v5}, LQ0/e;->z(JI)V

    .line 213
    .line 214
    .line 215
    const/16 v5, 0xd

    .line 216
    .line 217
    iget-wide v14, v0, Ln1/j;->n:J

    .line 218
    .line 219
    invoke-interface {v1, v14, v15, v5}, LQ0/e;->z(JI)V

    .line 220
    .line 221
    .line 222
    const/16 v5, 0xe

    .line 223
    .line 224
    iget-wide v14, v0, Ln1/j;->o:J

    .line 225
    .line 226
    invoke-interface {v1, v14, v15, v5}, LQ0/e;->z(JI)V

    .line 227
    .line 228
    .line 229
    const/16 v5, 0xf

    .line 230
    .line 231
    iget-wide v14, v0, Ln1/j;->p:J

    .line 232
    .line 233
    invoke-interface {v1, v14, v15, v5}, LQ0/e;->z(JI)V

    .line 234
    .line 235
    .line 236
    iget-boolean v5, v0, Ln1/j;->q:Z

    .line 237
    .line 238
    const/16 v10, 0x10

    .line 239
    .line 240
    int-to-long v14, v5

    .line 241
    invoke-interface {v1, v14, v15, v10}, LQ0/e;->z(JI)V

    .line 242
    .line 243
    .line 244
    iget v5, v0, Ln1/j;->r:I

    .line 245
    .line 246
    invoke-static {v5}, Lw/h;->b(I)I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    if-eqz v10, :cond_e

    .line 251
    .line 252
    if-ne v10, v4, :cond_b

    .line 253
    .line 254
    move v5, v4

    .line 255
    goto :goto_a

    .line 256
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 257
    .line 258
    new-instance v1, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    const/4 v3, 0x1

    .line 264
    if-eq v5, v3, :cond_d

    .line 265
    .line 266
    const/4 v3, 0x2

    .line 267
    if-eq v5, v3, :cond_c

    .line 268
    .line 269
    const-string v3, "null"

    .line 270
    .line 271
    goto :goto_9

    .line 272
    :cond_c
    const-string v3, "DROP_WORK_REQUEST"

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_d
    const-string v3, "RUN_AS_NON_EXPEDITED_WORK_REQUEST"

    .line 276
    .line 277
    :goto_9
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v0

    .line 291
    :cond_e
    const/4 v5, 0x0

    .line 292
    :goto_a
    const/16 v10, 0x11

    .line 293
    .line 294
    int-to-long v14, v5

    .line 295
    invoke-interface {v1, v14, v15, v10}, LQ0/e;->z(JI)V

    .line 296
    .line 297
    .line 298
    iget-object v0, v0, Ln1/j;->j:Le1/c;

    .line 299
    .line 300
    const/16 v15, 0x15

    .line 301
    .line 302
    const/16 v8, 0x14

    .line 303
    .line 304
    const/16 v11, 0x13

    .line 305
    .line 306
    const/16 v5, 0x12

    .line 307
    .line 308
    if-eqz v0, :cond_1a

    .line 309
    .line 310
    iget v10, v0, Le1/c;->a:I

    .line 311
    .line 312
    invoke-static {v10}, Lw/h;->b(I)I

    .line 313
    .line 314
    .line 315
    move-result v14

    .line 316
    if-eqz v14, :cond_13

    .line 317
    .line 318
    if-eq v14, v4, :cond_14

    .line 319
    .line 320
    if-eq v14, v3, :cond_12

    .line 321
    .line 322
    if-eq v14, v6, :cond_11

    .line 323
    .line 324
    if-eq v14, v7, :cond_10

    .line 325
    .line 326
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 327
    .line 328
    const/16 v4, 0x1e

    .line 329
    .line 330
    if-lt v3, v4, :cond_f

    .line 331
    .line 332
    if-ne v10, v9, :cond_f

    .line 333
    .line 334
    const/4 v4, 0x5

    .line 335
    goto :goto_b

    .line 336
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 337
    .line 338
    new-instance v1, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/k1;->z(I)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw v0

    .line 361
    :cond_10
    move v4, v7

    .line 362
    goto :goto_b

    .line 363
    :cond_11
    move v4, v6

    .line 364
    goto :goto_b

    .line 365
    :cond_12
    move v4, v3

    .line 366
    goto :goto_b

    .line 367
    :cond_13
    const/4 v4, 0x0

    .line 368
    :cond_14
    :goto_b
    int-to-long v3, v4

    .line 369
    invoke-interface {v1, v3, v4, v5}, LQ0/e;->z(JI)V

    .line 370
    .line 371
    .line 372
    iget-boolean v3, v0, Le1/c;->b:Z

    .line 373
    .line 374
    int-to-long v3, v3

    .line 375
    invoke-interface {v1, v3, v4, v11}, LQ0/e;->z(JI)V

    .line 376
    .line 377
    .line 378
    iget-boolean v3, v0, Le1/c;->c:Z

    .line 379
    .line 380
    int-to-long v3, v3

    .line 381
    invoke-interface {v1, v3, v4, v8}, LQ0/e;->z(JI)V

    .line 382
    .line 383
    .line 384
    iget-boolean v3, v0, Le1/c;->d:Z

    .line 385
    .line 386
    int-to-long v3, v3

    .line 387
    invoke-interface {v1, v3, v4, v15}, LQ0/e;->z(JI)V

    .line 388
    .line 389
    .line 390
    iget-boolean v3, v0, Le1/c;->e:Z

    .line 391
    .line 392
    int-to-long v3, v3

    .line 393
    const/16 v5, 0x16

    .line 394
    .line 395
    invoke-interface {v1, v3, v4, v5}, LQ0/e;->z(JI)V

    .line 396
    .line 397
    .line 398
    iget-wide v3, v0, Le1/c;->f:J

    .line 399
    .line 400
    const/16 v5, 0x17

    .line 401
    .line 402
    invoke-interface {v1, v3, v4, v5}, LQ0/e;->z(JI)V

    .line 403
    .line 404
    .line 405
    iget-wide v3, v0, Le1/c;->g:J

    .line 406
    .line 407
    const/16 v5, 0x18

    .line 408
    .line 409
    invoke-interface {v1, v3, v4, v5}, LQ0/e;->z(JI)V

    .line 410
    .line 411
    .line 412
    iget-object v0, v0, Le1/c;->h:Le1/e;

    .line 413
    .line 414
    iget-object v3, v0, Le1/e;->a:Ljava/util/HashSet;

    .line 415
    .line 416
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    const/4 v4, 0x0

    .line 421
    if-nez v3, :cond_15

    .line 422
    .line 423
    goto :goto_11

    .line 424
    :cond_15
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 425
    .line 426
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 427
    .line 428
    .line 429
    :try_start_0
    new-instance v5, Ljava/io/ObjectOutputStream;

    .line 430
    .line 431
    invoke-direct {v5, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 432
    .line 433
    .line 434
    iget-object v0, v0, Le1/e;->a:Ljava/util/HashSet;

    .line 435
    .line 436
    :try_start_1
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    invoke-virtual {v5, v4}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    if-eqz v4, :cond_16

    .line 452
    .line 453
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    check-cast v4, Le1/d;

    .line 458
    .line 459
    iget-object v6, v4, Le1/d;->a:Landroid/net/Uri;

    .line 460
    .line 461
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v6

    .line 465
    invoke-virtual {v5, v6}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    iget-boolean v4, v4, Le1/d;->b:Z

    .line 469
    .line 470
    invoke-virtual {v5, v4}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 471
    .line 472
    .line 473
    goto :goto_c

    .line 474
    :catchall_0
    move-exception v0

    .line 475
    move-object v1, v0

    .line 476
    move-object v4, v5

    .line 477
    goto :goto_12

    .line 478
    :catch_0
    move-exception v0

    .line 479
    move-object v4, v5

    .line 480
    goto :goto_e

    .line 481
    :cond_16
    :try_start_2
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 482
    .line 483
    .line 484
    goto :goto_d

    .line 485
    :catch_1
    move-exception v0

    .line 486
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 487
    .line 488
    .line 489
    :goto_d
    :try_start_3
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 490
    .line 491
    .line 492
    goto :goto_10

    .line 493
    :catch_2
    move-exception v0

    .line 494
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 495
    .line 496
    .line 497
    goto :goto_10

    .line 498
    :catchall_1
    move-exception v0

    .line 499
    move-object v1, v0

    .line 500
    goto :goto_12

    .line 501
    :catch_3
    move-exception v0

    .line 502
    :goto_e
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 503
    .line 504
    .line 505
    if-eqz v4, :cond_17

    .line 506
    .line 507
    :try_start_5
    invoke-virtual {v4}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 508
    .line 509
    .line 510
    goto :goto_f

    .line 511
    :catch_4
    move-exception v0

    .line 512
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 513
    .line 514
    .line 515
    :cond_17
    :goto_f
    :try_start_6
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 516
    .line 517
    .line 518
    :goto_10
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    :goto_11
    if-nez v4, :cond_18

    .line 523
    .line 524
    const/16 v3, 0x19

    .line 525
    .line 526
    invoke-interface {v1, v3}, LQ0/e;->t(I)V

    .line 527
    .line 528
    .line 529
    goto :goto_15

    .line 530
    :cond_18
    const/16 v3, 0x19

    .line 531
    .line 532
    invoke-interface {v1, v3, v4}, LQ0/e;->U(I[B)V

    .line 533
    .line 534
    .line 535
    goto :goto_15

    .line 536
    :goto_12
    if-eqz v4, :cond_19

    .line 537
    .line 538
    :try_start_7
    invoke-virtual {v4}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 539
    .line 540
    .line 541
    goto :goto_13

    .line 542
    :catch_5
    move-exception v0

    .line 543
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 544
    .line 545
    .line 546
    :cond_19
    :goto_13
    :try_start_8
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 547
    .line 548
    .line 549
    goto :goto_14

    .line 550
    :catch_6
    move-exception v0

    .line 551
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 552
    .line 553
    .line 554
    :goto_14
    throw v1

    .line 555
    :cond_1a
    invoke-interface {v1, v5}, LQ0/e;->t(I)V

    .line 556
    .line 557
    .line 558
    invoke-interface {v1, v11}, LQ0/e;->t(I)V

    .line 559
    .line 560
    .line 561
    invoke-interface {v1, v8}, LQ0/e;->t(I)V

    .line 562
    .line 563
    .line 564
    invoke-interface {v1, v15}, LQ0/e;->t(I)V

    .line 565
    .line 566
    .line 567
    const/16 v5, 0x16

    .line 568
    .line 569
    invoke-interface {v1, v5}, LQ0/e;->t(I)V

    .line 570
    .line 571
    .line 572
    const/16 v5, 0x17

    .line 573
    .line 574
    invoke-interface {v1, v5}, LQ0/e;->t(I)V

    .line 575
    .line 576
    .line 577
    const/16 v5, 0x18

    .line 578
    .line 579
    invoke-interface {v1, v5}, LQ0/e;->t(I)V

    .line 580
    .line 581
    .line 582
    const/16 v3, 0x19

    .line 583
    .line 584
    invoke-interface {v1, v3}, LQ0/e;->t(I)V

    .line 585
    .line 586
    .line 587
    :goto_15
    return-void

    .line 588
    :pswitch_1
    move-object/from16 v0, p2

    .line 589
    .line 590
    check-cast v0, Ln1/g;

    .line 591
    .line 592
    iget-object v3, v0, Ln1/g;->a:Ljava/lang/String;

    .line 593
    .line 594
    const/4 v4, 0x1

    .line 595
    if-nez v3, :cond_1b

    .line 596
    .line 597
    invoke-interface {v1, v4}, LQ0/e;->t(I)V

    .line 598
    .line 599
    .line 600
    goto :goto_16

    .line 601
    :cond_1b
    invoke-interface {v1, v4, v3}, LQ0/e;->m(ILjava/lang/String;)V

    .line 602
    .line 603
    .line 604
    :goto_16
    iget-object v0, v0, Ln1/g;->b:Le1/h;

    .line 605
    .line 606
    invoke-static {v0}, Le1/h;->b(Le1/h;)[B

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    const/4 v3, 0x2

    .line 611
    if-nez v0, :cond_1c

    .line 612
    .line 613
    invoke-interface {v1, v3}, LQ0/e;->t(I)V

    .line 614
    .line 615
    .line 616
    goto :goto_17

    .line 617
    :cond_1c
    invoke-interface {v1, v3, v0}, LQ0/e;->U(I[B)V

    .line 618
    .line 619
    .line 620
    :goto_17
    return-void

    .line 621
    :pswitch_2
    move-object/from16 v0, p2

    .line 622
    .line 623
    check-cast v0, Ln1/f;

    .line 624
    .line 625
    iget-object v3, v0, Ln1/f;->a:Ljava/lang/String;

    .line 626
    .line 627
    const/4 v4, 0x1

    .line 628
    if-nez v3, :cond_1d

    .line 629
    .line 630
    invoke-interface {v1, v4}, LQ0/e;->t(I)V

    .line 631
    .line 632
    .line 633
    goto :goto_18

    .line 634
    :cond_1d
    invoke-interface {v1, v4, v3}, LQ0/e;->m(ILjava/lang/String;)V

    .line 635
    .line 636
    .line 637
    :goto_18
    const/4 v3, 0x2

    .line 638
    iget-object v0, v0, Ln1/f;->b:Ljava/lang/String;

    .line 639
    .line 640
    if-nez v0, :cond_1e

    .line 641
    .line 642
    invoke-interface {v1, v3}, LQ0/e;->t(I)V

    .line 643
    .line 644
    .line 645
    goto :goto_19

    .line 646
    :cond_1e
    invoke-interface {v1, v3, v0}, LQ0/e;->m(ILjava/lang/String;)V

    .line 647
    .line 648
    .line 649
    :goto_19
    return-void

    .line 650
    :pswitch_3
    move-object/from16 v0, p2

    .line 651
    .line 652
    check-cast v0, Ln1/d;

    .line 653
    .line 654
    iget-object v3, v0, Ln1/d;->a:Ljava/lang/String;

    .line 655
    .line 656
    const/4 v4, 0x1

    .line 657
    if-nez v3, :cond_1f

    .line 658
    .line 659
    invoke-interface {v1, v4}, LQ0/e;->t(I)V

    .line 660
    .line 661
    .line 662
    goto :goto_1a

    .line 663
    :cond_1f
    invoke-interface {v1, v4, v3}, LQ0/e;->m(ILjava/lang/String;)V

    .line 664
    .line 665
    .line 666
    :goto_1a
    iget v0, v0, Ln1/d;->b:I

    .line 667
    .line 668
    int-to-long v3, v0

    .line 669
    const/4 v0, 0x2

    .line 670
    invoke-interface {v1, v3, v4, v0}, LQ0/e;->z(JI)V

    .line 671
    .line 672
    .line 673
    return-void

    .line 674
    :pswitch_4
    move-object/from16 v0, p2

    .line 675
    .line 676
    check-cast v0, Ln1/c;

    .line 677
    .line 678
    iget-object v3, v0, Ln1/c;->a:Ljava/lang/String;

    .line 679
    .line 680
    const/4 v4, 0x1

    .line 681
    if-nez v3, :cond_20

    .line 682
    .line 683
    invoke-interface {v1, v4}, LQ0/e;->t(I)V

    .line 684
    .line 685
    .line 686
    goto :goto_1b

    .line 687
    :cond_20
    invoke-interface {v1, v4, v3}, LQ0/e;->m(ILjava/lang/String;)V

    .line 688
    .line 689
    .line 690
    :goto_1b
    iget-object v0, v0, Ln1/c;->b:Ljava/lang/Long;

    .line 691
    .line 692
    const/4 v3, 0x2

    .line 693
    if-nez v0, :cond_21

    .line 694
    .line 695
    invoke-interface {v1, v3}, LQ0/e;->t(I)V

    .line 696
    .line 697
    .line 698
    goto :goto_1c

    .line 699
    :cond_21
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 700
    .line 701
    .line 702
    move-result-wide v4

    .line 703
    invoke-interface {v1, v4, v5, v3}, LQ0/e;->z(JI)V

    .line 704
    .line 705
    .line 706
    :goto_1c
    return-void

    .line 707
    :pswitch_5
    move-object/from16 v0, p2

    .line 708
    .line 709
    check-cast v0, Ln1/a;

    .line 710
    .line 711
    iget-object v3, v0, Ln1/a;->a:Ljava/lang/String;

    .line 712
    .line 713
    const/4 v4, 0x1

    .line 714
    if-nez v3, :cond_22

    .line 715
    .line 716
    invoke-interface {v1, v4}, LQ0/e;->t(I)V

    .line 717
    .line 718
    .line 719
    goto :goto_1d

    .line 720
    :cond_22
    invoke-interface {v1, v4, v3}, LQ0/e;->m(ILjava/lang/String;)V

    .line 721
    .line 722
    .line 723
    :goto_1d
    const/4 v3, 0x2

    .line 724
    iget-object v0, v0, Ln1/a;->b:Ljava/lang/String;

    .line 725
    .line 726
    if-nez v0, :cond_23

    .line 727
    .line 728
    invoke-interface {v1, v3}, LQ0/e;->t(I)V

    .line 729
    .line 730
    .line 731
    goto :goto_1e

    .line 732
    :cond_23
    invoke-interface {v1, v3, v0}, LQ0/e;->m(ILjava/lang/String;)V

    .line 733
    .line 734
    .line 735
    :goto_1e
    return-void

    .line 736
    nop

    .line 737
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final l(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LG0/H;->a()LR0/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {p0, v0, p1}, Ln1/b;->k(LR0/j;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, v0, LR0/j;->b:Landroid/database/sqlite/SQLiteStatement;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, LG0/H;->i(LR0/j;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    invoke-virtual {p0, v0}, LG0/H;->i(LR0/j;)V

    .line 19
    .line 20
    .line 21
    throw p1
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
.end method
