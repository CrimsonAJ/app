.class public final synthetic LA4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Landroid/os/Parcelable;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb5/m1;Lb5/Q1;ZLG4/a;I)V
    .locals 0

    .line 1
    iput p5, p0, LA4/k;->a:I

    iput-object p2, p0, LA4/k;->c:Landroid/os/Parcelable;

    iput-boolean p3, p0, LA4/k;->b:Z

    iput-object p4, p0, LA4/k;->d:Ljava/lang/Object;

    iput-object p1, p0, LA4/k;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;Landroid/content/Intent;Landroid/content/Context;ZLandroid/content/BroadcastReceiver$PendingResult;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, LA4/k;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA4/k;->c:Landroid/os/Parcelable;

    iput-object p3, p0, LA4/k;->d:Ljava/lang/Object;

    iput-boolean p4, p0, LA4/k;->b:Z

    iput-object p5, p0, LA4/k;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LA4/k;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, LA4/k;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lb5/m1;

    .line 11
    .line 12
    iget-object v2, v0, Lb5/m1;->d:Lb5/G;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lb5/n0;

    .line 19
    .line 20
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 21
    .line 22
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "Discarding data. Failed to send conditional user property to service"

    .line 26
    .line 27
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object v3, v1, LA4/k;->c:Landroid/os/Parcelable;

    .line 34
    .line 35
    check-cast v3, Lb5/Q1;

    .line 36
    .line 37
    iget-boolean v4, v1, LA4/k;->b:Z

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v4, v1, LA4/k;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, Lb5/e;

    .line 46
    .line 47
    :goto_0
    invoke-virtual {v0, v2, v4, v3}, Lb5/m1;->s0(Lb5/G;LG4/a;Lb5/Q1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lb5/m1;->B0()V

    .line 51
    .line 52
    .line 53
    :goto_1
    return-void

    .line 54
    :pswitch_0
    iget-object v0, v1, LA4/k;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lb5/m1;

    .line 57
    .line 58
    iget-object v2, v0, Lb5/m1;->d:Lb5/G;

    .line 59
    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lb5/n0;

    .line 65
    .line 66
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 67
    .line 68
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 69
    .line 70
    .line 71
    const-string v2, "Discarding data. Failed to send event to service"

    .line 72
    .line 73
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_2
    iget-object v3, v1, LA4/k;->c:Landroid/os/Parcelable;

    .line 80
    .line 81
    check-cast v3, Lb5/Q1;

    .line 82
    .line 83
    iget-boolean v4, v1, LA4/k;->b:Z

    .line 84
    .line 85
    if-eqz v4, :cond_3

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    iget-object v4, v1, LA4/k;->d:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Lb5/t;

    .line 92
    .line 93
    :goto_2
    invoke-virtual {v0, v2, v4, v3}, Lb5/m1;->s0(Lb5/G;LG4/a;Lb5/Q1;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Lb5/m1;->B0()V

    .line 97
    .line 98
    .line 99
    :goto_3
    return-void

    .line 100
    :pswitch_1
    iget-object v0, v1, LA4/k;->e:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lb5/m1;

    .line 103
    .line 104
    iget-object v2, v0, Lb5/m1;->d:Lb5/G;

    .line 105
    .line 106
    if-nez v2, :cond_4

    .line 107
    .line 108
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lb5/n0;

    .line 111
    .line 112
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 113
    .line 114
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 115
    .line 116
    .line 117
    const-string v2, "Discarding data. Failed to set user property"

    .line 118
    .line 119
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 120
    .line 121
    invoke-virtual {v0, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_4
    iget-object v3, v1, LA4/k;->c:Landroid/os/Parcelable;

    .line 126
    .line 127
    check-cast v3, Lb5/Q1;

    .line 128
    .line 129
    iget-boolean v4, v1, LA4/k;->b:Z

    .line 130
    .line 131
    if-eqz v4, :cond_5

    .line 132
    .line 133
    const/4 v4, 0x0

    .line 134
    goto :goto_4

    .line 135
    :cond_5
    iget-object v4, v1, LA4/k;->d:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v4, Lb5/M1;

    .line 138
    .line 139
    :goto_4
    invoke-virtual {v0, v2, v4, v3}, Lb5/m1;->s0(Lb5/G;LG4/a;Lb5/Q1;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Lb5/m1;->B0()V

    .line 143
    .line 144
    .line 145
    :goto_5
    return-void

    .line 146
    :pswitch_2
    iget-object v0, v1, LA4/k;->c:Landroid/os/Parcelable;

    .line 147
    .line 148
    check-cast v0, Landroid/content/Intent;

    .line 149
    .line 150
    iget-object v2, v1, LA4/k;->d:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v2, Landroid/content/Context;

    .line 153
    .line 154
    iget-boolean v3, v1, LA4/k;->b:Z

    .line 155
    .line 156
    iget-object v4, v1, LA4/k;->e:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v4, Landroid/content/BroadcastReceiver$PendingResult;

    .line 159
    .line 160
    :try_start_0
    const-string v5, "wrapped_intent"

    .line 161
    .line 162
    invoke-virtual {v0, v5}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    instance-of v6, v5, Landroid/content/Intent;

    .line 167
    .line 168
    const/4 v7, 0x0

    .line 169
    if-eqz v6, :cond_6

    .line 170
    .line 171
    check-cast v5, Landroid/content/Intent;

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :catchall_0
    move-exception v0

    .line 175
    goto/16 :goto_d

    .line 176
    .line 177
    :cond_6
    move-object v5, v7

    .line 178
    :goto_6
    if-eqz v5, :cond_7

    .line 179
    .line 180
    invoke-static {v5}, Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;->a(Landroid/content/Intent;)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    goto/16 :goto_b

    .line 185
    .line 186
    :cond_7
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    const/16 v6, 0x1f4

    .line 191
    .line 192
    if-nez v5, :cond_9

    .line 193
    .line 194
    :cond_8
    :goto_7
    move v0, v6

    .line 195
    goto/16 :goto_b

    .line 196
    .line 197
    :cond_9
    new-instance v5, LA4/a;

    .line 198
    .line 199
    invoke-direct {v5, v0}, LA4/a;-><init>(Landroid/content/Intent;)V

    .line 200
    .line 201
    .line 202
    new-instance v8, Ljava/util/concurrent/CountDownLatch;

    .line 203
    .line 204
    const/4 v9, 0x1

    .line 205
    invoke-direct {v8, v9}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 206
    .line 207
    .line 208
    const-class v10, Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;

    .line 209
    .line 210
    monitor-enter v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    :try_start_1
    sget-object v11, Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;->b:Ljava/lang/ref/SoftReference;

    .line 212
    .line 213
    if-eqz v11, :cond_a

    .line 214
    .line 215
    invoke-virtual {v11}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    check-cast v7, Ljava/util/concurrent/Executor;

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :catchall_1
    move-exception v0

    .line 223
    goto/16 :goto_c

    .line 224
    .line 225
    :cond_a
    :goto_8
    if-nez v7, :cond_b

    .line 226
    .line 227
    new-instance v7, LL4/a;

    .line 228
    .line 229
    const-string v11, "pscm-ack-executor"

    .line 230
    .line 231
    invoke-direct {v7, v11}, LL4/a;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    new-instance v11, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 235
    .line 236
    sget-object v16, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 237
    .line 238
    new-instance v17, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 239
    .line 240
    invoke-direct/range {v17 .. v17}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 241
    .line 242
    .line 243
    const-wide/16 v14, 0x3c

    .line 244
    .line 245
    const/4 v12, 0x1

    .line 246
    const/4 v13, 0x1

    .line 247
    move-object/from16 v18, v7

    .line 248
    .line 249
    invoke-direct/range {v11 .. v18}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v11, v9}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 253
    .line 254
    .line 255
    invoke-static {v11}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    new-instance v9, Ljava/lang/ref/SoftReference;

    .line 260
    .line 261
    invoke-direct {v9, v7}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    sput-object v9, Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;->b:Ljava/lang/ref/SoftReference;

    .line 265
    .line 266
    :cond_b
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 267
    :try_start_2
    new-instance v9, LA4/j;

    .line 268
    .line 269
    const/4 v10, 0x0

    .line 270
    invoke-direct {v9, v2, v5, v8, v10}, LA4/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v7, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 274
    .line 275
    .line 276
    :try_start_3
    new-instance v5, Lcom/google/firebase/messaging/j;

    .line 277
    .line 278
    invoke-direct {v5, v2}, Lcom/google/firebase/messaging/j;-><init>(Landroid/content/Context;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v5, v0}, Lcom/google/firebase/messaging/j;->b(Landroid/content/Intent;)Lf5/q;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-static {v0}, Ls8/n;->b(Lf5/h;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Ljava/lang/Integer;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result v0
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 295
    move v6, v0

    .line 296
    goto :goto_a

    .line 297
    :catch_0
    move-exception v0

    .line 298
    goto :goto_9

    .line 299
    :catch_1
    move-exception v0

    .line 300
    :goto_9
    :try_start_4
    const-string v2, "FirebaseMessaging"

    .line 301
    .line 302
    const-string v5, "Failed to send message to service."

    .line 303
    .line 304
    invoke-static {v2, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 305
    .line 306
    .line 307
    :goto_a
    :try_start_5
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 308
    .line 309
    const-wide/16 v9, 0x1

    .line 310
    .line 311
    invoke-virtual {v0, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 312
    .line 313
    .line 314
    move-result-wide v9

    .line 315
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 316
    .line 317
    invoke-virtual {v8, v9, v10, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-nez v0, :cond_8

    .line 322
    .line 323
    const-string v0, "CloudMessagingReceiver"

    .line 324
    .line 325
    const-string v2, "Message ack timed out"

    .line 326
    .line 327
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 328
    .line 329
    .line 330
    goto/16 :goto_7

    .line 331
    .line 332
    :catch_2
    move-exception v0

    .line 333
    :try_start_6
    const-string v2, "CloudMessagingReceiver"

    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    const-string v5, "Message ack failed: "

    .line 340
    .line 341
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 346
    .line 347
    .line 348
    goto/16 :goto_7

    .line 349
    .line 350
    :goto_b
    if-eqz v3, :cond_c

    .line 351
    .line 352
    if-eqz v4, :cond_c

    .line 353
    .line 354
    invoke-virtual {v4, v0}, Landroid/content/BroadcastReceiver$PendingResult;->setResultCode(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 355
    .line 356
    .line 357
    :cond_c
    if-eqz v4, :cond_d

    .line 358
    .line 359
    invoke-virtual {v4}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 360
    .line 361
    .line 362
    :cond_d
    return-void

    .line 363
    :goto_c
    :try_start_7
    monitor-exit v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 364
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 365
    :goto_d
    if-eqz v4, :cond_e

    .line 366
    .line 367
    invoke-virtual {v4}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 368
    .line 369
    .line 370
    :cond_e
    throw v0

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method
