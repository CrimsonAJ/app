.class public final Li/t;
.super LA5/q;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Li/w;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li/w;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li/t;->c:I

    .line 3
    iput-object p1, p0, Li/t;->d:Li/w;

    invoke-direct {p0, p1}, LA5/q;-><init>(Li/w;)V

    .line 4
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "power"

    .line 5
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Li/t;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li/w;Lb5/G1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li/t;->c:I

    .line 1
    iput-object p1, p0, Li/t;->d:Li/w;

    invoke-direct {p0, p1}, LA5/q;-><init>(Li/w;)V

    .line 2
    iput-object p2, p0, Li/t;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final f()Landroid/content/IntentFilter;
    .locals 2

    .line 1
    iget v0, p0, Li/t;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "android.intent.action.TIME_SET"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "android.intent.action.TIME_TICK"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    new-instance v0, Landroid/content/IntentFilter;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v1, "android.os.action.POWER_SAVE_MODE_CHANGED"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final i()I
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Li/t;->c:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Li/t;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lb5/G1;

    .line 11
    .line 12
    iget-object v2, v0, Lb5/G1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Li/E;

    .line 15
    .line 16
    iget-wide v3, v2, Li/E;->b:J

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    cmp-long v3, v3, v5

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    if-lez v3, :cond_0

    .line 26
    .line 27
    iget-boolean v0, v2, Li/E;->a:Z

    .line 28
    .line 29
    goto/16 :goto_8

    .line 30
    .line 31
    :cond_0
    iget-object v3, v0, Lb5/G1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Landroid/content/Context;

    .line 34
    .line 35
    const-string v5, "android.permission.ACCESS_COARSE_LOCATION"

    .line 36
    .line 37
    invoke-static {v3, v5}, LE/d;->b(Landroid/content/Context;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const-string v6, "Failed to get last known location"

    .line 42
    .line 43
    const-string v7, "TwilightManager"

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    iget-object v0, v0, Lb5/G1;->c:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v9, v0

    .line 49
    check-cast v9, Landroid/location/LocationManager;

    .line 50
    .line 51
    if-nez v5, :cond_2

    .line 52
    .line 53
    const-string v0, "network"

    .line 54
    .line 55
    :try_start_0
    invoke-virtual {v9, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_1

    .line 60
    .line 61
    invoke-virtual {v9, v0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 62
    .line 63
    .line 64
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception v0

    .line 67
    invoke-static {v7, v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 68
    .line 69
    .line 70
    :cond_1
    move-object v0, v8

    .line 71
    :goto_0
    move-object v5, v0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move-object v5, v8

    .line 74
    :goto_1
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 75
    .line 76
    invoke-static {v3, v0}, LE/d;->b(Landroid/content/Context;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    const-string v0, "gps"

    .line 83
    .line 84
    :try_start_1
    invoke-virtual {v9, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_3

    .line 89
    .line 90
    invoke-virtual {v9, v0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 91
    .line 92
    .line 93
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 94
    goto :goto_2

    .line 95
    :catch_1
    move-exception v0

    .line 96
    invoke-static {v7, v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_2
    if-eqz v8, :cond_4

    .line 100
    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    invoke-virtual {v8}, Landroid/location/Location;->getTime()J

    .line 104
    .line 105
    .line 106
    move-result-wide v9

    .line 107
    invoke-virtual {v5}, Landroid/location/Location;->getTime()J

    .line 108
    .line 109
    .line 110
    move-result-wide v11

    .line 111
    cmp-long v0, v9, v11

    .line 112
    .line 113
    if-lez v0, :cond_5

    .line 114
    .line 115
    :goto_3
    move-object v5, v8

    .line 116
    goto :goto_4

    .line 117
    :cond_4
    if-eqz v8, :cond_5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    :goto_4
    const/4 v0, 0x0

    .line 121
    if-eqz v5, :cond_c

    .line 122
    .line 123
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 124
    .line 125
    .line 126
    move-result-wide v13

    .line 127
    sget-object v3, Lcom/google/android/gms/internal/cast/e1;->d:Lcom/google/android/gms/internal/cast/e1;

    .line 128
    .line 129
    if-nez v3, :cond_6

    .line 130
    .line 131
    new-instance v3, Lcom/google/android/gms/internal/cast/e1;

    .line 132
    .line 133
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 134
    .line 135
    .line 136
    sput-object v3, Lcom/google/android/gms/internal/cast/e1;->d:Lcom/google/android/gms/internal/cast/e1;

    .line 137
    .line 138
    :cond_6
    sget-object v6, Lcom/google/android/gms/internal/cast/e1;->d:Lcom/google/android/gms/internal/cast/e1;

    .line 139
    .line 140
    const-wide/32 v15, 0x5265c00

    .line 141
    .line 142
    .line 143
    sub-long v11, v13, v15

    .line 144
    .line 145
    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    .line 146
    .line 147
    .line 148
    move-result-wide v7

    .line 149
    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    .line 150
    .line 151
    .line 152
    move-result-wide v9

    .line 153
    invoke-virtual/range {v6 .. v12}, Lcom/google/android/gms/internal/cast/e1;->a(DDJ)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    .line 157
    .line 158
    .line 159
    move-result-wide v9

    .line 160
    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    .line 161
    .line 162
    .line 163
    move-result-wide v11

    .line 164
    move-object v8, v6

    .line 165
    invoke-virtual/range {v8 .. v14}, Lcom/google/android/gms/internal/cast/e1;->a(DDJ)V

    .line 166
    .line 167
    .line 168
    iget v3, v6, Lcom/google/android/gms/internal/cast/e1;->c:I

    .line 169
    .line 170
    if-ne v3, v4, :cond_7

    .line 171
    .line 172
    move v0, v4

    .line 173
    :cond_7
    iget-wide v7, v6, Lcom/google/android/gms/internal/cast/e1;->b:J

    .line 174
    .line 175
    iget-wide v9, v6, Lcom/google/android/gms/internal/cast/e1;->a:J

    .line 176
    .line 177
    add-long v11, v13, v15

    .line 178
    .line 179
    move-wide v15, v7

    .line 180
    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    .line 181
    .line 182
    .line 183
    move-result-wide v7

    .line 184
    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    .line 185
    .line 186
    .line 187
    move-result-wide v17

    .line 188
    move-wide/from16 v19, v17

    .line 189
    .line 190
    move-wide/from16 v17, v9

    .line 191
    .line 192
    move-wide/from16 v9, v19

    .line 193
    .line 194
    invoke-virtual/range {v6 .. v12}, Lcom/google/android/gms/internal/cast/e1;->a(DDJ)V

    .line 195
    .line 196
    .line 197
    iget-wide v7, v6, Lcom/google/android/gms/internal/cast/e1;->b:J

    .line 198
    .line 199
    const-wide/16 v5, -0x1

    .line 200
    .line 201
    cmp-long v3, v15, v5

    .line 202
    .line 203
    if-eqz v3, :cond_b

    .line 204
    .line 205
    cmp-long v3, v17, v5

    .line 206
    .line 207
    if-nez v3, :cond_8

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_8
    cmp-long v3, v13, v17

    .line 211
    .line 212
    if-lez v3, :cond_9

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_9
    cmp-long v3, v13, v15

    .line 216
    .line 217
    if-lez v3, :cond_a

    .line 218
    .line 219
    move-wide/from16 v7, v17

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_a
    move-wide v7, v15

    .line 223
    :goto_5
    const-wide/32 v5, 0xea60

    .line 224
    .line 225
    .line 226
    add-long/2addr v7, v5

    .line 227
    goto :goto_7

    .line 228
    :cond_b
    :goto_6
    const-wide/32 v5, 0x2932e00

    .line 229
    .line 230
    .line 231
    add-long v7, v13, v5

    .line 232
    .line 233
    :goto_7
    iput-boolean v0, v2, Li/E;->a:Z

    .line 234
    .line 235
    iput-wide v7, v2, Li/E;->b:J

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :cond_c
    const-string v2, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."

    .line 239
    .line 240
    invoke-static {v7, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    const/16 v3, 0xb

    .line 248
    .line 249
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    const/4 v3, 0x6

    .line 254
    if-lt v2, v3, :cond_d

    .line 255
    .line 256
    const/16 v3, 0x16

    .line 257
    .line 258
    if-lt v2, v3, :cond_e

    .line 259
    .line 260
    :cond_d
    move v0, v4

    .line 261
    :cond_e
    :goto_8
    if-eqz v0, :cond_f

    .line 262
    .line 263
    const/4 v4, 0x2

    .line 264
    :cond_f
    return v4

    .line 265
    :pswitch_0
    iget-object v0, v1, Li/t;->e:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, Landroid/os/PowerManager;

    .line 268
    .line 269
    invoke-static {v0}, Li/p;->a(Landroid/os/PowerManager;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_10

    .line 274
    .line 275
    const/4 v0, 0x2

    .line 276
    goto :goto_9

    .line 277
    :cond_10
    const/4 v0, 0x1

    .line 278
    :goto_9
    return v0

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final p()V
    .locals 2

    .line 1
    iget v0, p0, Li/t;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Li/t;->d:Li/w;

    .line 8
    .line 9
    invoke-virtual {v1, v0, v0}, Li/w;->k(ZZ)Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    const/4 v0, 0x1

    .line 14
    iget-object v1, p0, Li/t;->d:Li/w;

    .line 15
    .line 16
    invoke-virtual {v1, v0, v0}, Li/w;->k(ZZ)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
