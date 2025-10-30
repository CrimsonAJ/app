.class public final Lcom/google/android/gms/internal/measurement/a0;
.super Lcom/google/android/gms/internal/measurement/g0;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/j0;Landroid/app/Activity;Lcom/google/android/gms/internal/measurement/G;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a0;->e:I

    .line 2
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/a0;->g:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/a0;->h:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/a0;->f:Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/j0;->a:Lcom/google/android/gms/internal/measurement/k0;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/g0;-><init>(Lcom/google/android/gms/internal/measurement/k0;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/j0;Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a0;->e:I

    .line 3
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/a0;->h:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/a0;->g:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/a0;->f:Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/j0;->a:Lcom/google/android/gms/internal/measurement/k0;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/g0;-><init>(Lcom/google/android/gms/internal/measurement/k0;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/k0;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/google/android/gms/internal/measurement/a0;->e:I

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/a0;->g:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/a0;->h:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/a0;->f:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/g0;-><init>(Lcom/google/android/gms/internal/measurement/k0;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lcom/google/android/gms/internal/measurement/a0;->e:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/a0;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/google/android/gms/internal/measurement/j0;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/j0;->a:Lcom/google/android/gms/internal/measurement/k0;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/k0;->h:Lcom/google/android/gms/internal/measurement/J;

    .line 15
    .line 16
    invoke-static {v0}, LF4/y;->h(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/a0;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Landroid/app/Activity;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/W;->f(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/W;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/a0;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Lcom/google/android/gms/internal/measurement/G;

    .line 30
    .line 31
    iget-wide v4, v1, Lcom/google/android/gms/internal/measurement/g0;->b:J

    .line 32
    .line 33
    invoke-interface {v0, v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/J;->onActivitySaveInstanceStateByScionActivityInfo(Lcom/google/android/gms/internal/measurement/W;Lcom/google/android/gms/internal/measurement/L;J)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/a0;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Landroid/os/Bundle;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    new-instance v2, Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v3, "com.google.app_measurement.screen_service"

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    instance-of v4, v0, Landroid/os/Bundle;

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    check-cast v0, Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 v2, 0x0

    .line 71
    :cond_1
    :goto_0
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/a0;->f:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lcom/google/android/gms/internal/measurement/j0;

    .line 74
    .line 75
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/j0;->a:Lcom/google/android/gms/internal/measurement/k0;

    .line 76
    .line 77
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/k0;->h:Lcom/google/android/gms/internal/measurement/J;

    .line 78
    .line 79
    invoke-static {v0}, LF4/y;->h(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/a0;->g:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, Landroid/app/Activity;

    .line 85
    .line 86
    iget-wide v4, v1, Lcom/google/android/gms/internal/measurement/g0;->b:J

    .line 87
    .line 88
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/W;->f(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/W;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-interface {v0, v3, v2, v4, v5}, Lcom/google/android/gms/internal/measurement/J;->onActivityCreatedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/W;Landroid/os/Bundle;J)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_1
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/a0;->f:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Lcom/google/android/gms/internal/measurement/k0;

    .line 99
    .line 100
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/k0;->h:Lcom/google/android/gms/internal/measurement/J;

    .line 101
    .line 102
    invoke-static {v0}, LF4/y;->h(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/a0;->g:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Ljava/lang/String;

    .line 108
    .line 109
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/a0;->h:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Lcom/google/android/gms/internal/measurement/G;

    .line 112
    .line 113
    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/measurement/J;->getMaxUserProperties(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/L;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_2
    const-string v2, "com.google.android.gms.measurement.dynamite"

    .line 118
    .line 119
    const/4 v3, 0x1

    .line 120
    const/4 v4, 0x0

    .line 121
    :try_start_0
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/a0;->f:Ljava/lang/Object;

    .line 122
    .line 123
    move-object v5, v0

    .line 124
    check-cast v5, Lcom/google/android/gms/internal/measurement/k0;

    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/a0;->g:Ljava/lang/Object;

    .line 130
    .line 131
    move-object v6, v0

    .line 132
    check-cast v6, Landroid/content/Context;

    .line 133
    .line 134
    invoke-static {v6}, LF4/y;->h(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 135
    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    :try_start_1
    sget-object v0, LO4/f;->c:LF5/e;

    .line 139
    .line 140
    invoke-static {v6, v0, v2}, LO4/f;->c(Landroid/content/Context;LO4/e;Ljava/lang/String;)LO4/f;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v7, "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"

    .line 145
    .line 146
    invoke-virtual {v0, v7}, LO4/f;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/I;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/internal/measurement/J;

    .line 151
    .line 152
    .line 153
    move-result-object v0
    :try_end_1
    .catch LO4/b; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 154
    goto :goto_1

    .line 155
    :catch_0
    move-exception v0

    .line 156
    :try_start_2
    invoke-virtual {v5, v0, v3, v4}, Lcom/google/android/gms/internal/measurement/k0;->a(Ljava/lang/Exception;ZZ)V

    .line 157
    .line 158
    .line 159
    move-object v0, v13

    .line 160
    :goto_1
    iput-object v0, v5, Lcom/google/android/gms/internal/measurement/k0;->h:Lcom/google/android/gms/internal/measurement/J;

    .line 161
    .line 162
    iget-object v0, v5, Lcom/google/android/gms/internal/measurement/k0;->h:Lcom/google/android/gms/internal/measurement/J;

    .line 163
    .line 164
    if-nez v0, :cond_2

    .line 165
    .line 166
    iget-object v0, v5, Lcom/google/android/gms/internal/measurement/k0;->a:Ljava/lang/String;

    .line 167
    .line 168
    const-string v2, "Failed to connect to measurement client."

    .line 169
    .line 170
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :catch_1
    move-exception v0

    .line 175
    goto :goto_3

    .line 176
    :cond_2
    invoke-static {v6, v2}, LO4/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-static {v6, v2, v4}, LO4/f;->d(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-ge v2, v0, :cond_3

    .line 189
    .line 190
    move v12, v3

    .line 191
    goto :goto_2

    .line 192
    :cond_3
    move v12, v4

    .line 193
    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/measurement/U;

    .line 194
    .line 195
    int-to-long v10, v7

    .line 196
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/a0;->h:Ljava/lang/Object;

    .line 197
    .line 198
    move-object/from16 v16, v2

    .line 199
    .line 200
    check-cast v16, Landroid/os/Bundle;

    .line 201
    .line 202
    invoke-static {v6}, Lb5/D0;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v17

    .line 206
    const-wide/32 v8, 0x1d0da

    .line 207
    .line 208
    .line 209
    const/4 v15, 0x0

    .line 210
    const/4 v14, 0x0

    .line 211
    move-object v7, v0

    .line 212
    invoke-direct/range {v7 .. v17}, Lcom/google/android/gms/internal/measurement/U;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-object v0, v5, Lcom/google/android/gms/internal/measurement/k0;->h:Lcom/google/android/gms/internal/measurement/J;

    .line 216
    .line 217
    invoke-static {v0}, LF4/y;->h(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    new-instance v2, LN4/b;

    .line 221
    .line 222
    invoke-direct {v2, v6}, LN4/b;-><init>(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    iget-wide v5, v1, Lcom/google/android/gms/internal/measurement/g0;->a:J

    .line 226
    .line 227
    invoke-interface {v0, v2, v7, v5, v6}, Lcom/google/android/gms/internal/measurement/J;->initialize(LN4/a;Lcom/google/android/gms/internal/measurement/U;J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :goto_3
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/a0;->f:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v2, Lcom/google/android/gms/internal/measurement/k0;

    .line 234
    .line 235
    invoke-virtual {v2, v0, v3, v4}, Lcom/google/android/gms/internal/measurement/k0;->a(Ljava/lang/Exception;ZZ)V

    .line 236
    .line 237
    .line 238
    :goto_4
    return-void

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
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

.method public b()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a0;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a0;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/gms/internal/measurement/G;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/G;->v0(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
