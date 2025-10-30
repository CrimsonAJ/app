.class public final Lco/notix/lsi/LockScreenInterstitialWorker;
.super Lco/notix/worker/SelfRestartingWorker;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/mq;

.field public final b:Lco/notix/ed;

.field public final c:Landroid/app/NotificationManager;

.field public final d:Lco/notix/gd;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lco/notix/worker/SelfRestartingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    invoke-static {}, Lco/notix/wq;->E()Lco/notix/mq;

    move-result-object p2

    iput-object p2, p0, Lco/notix/lsi/LockScreenInterstitialWorker;->a:Lco/notix/mq;

    invoke-static {}, Lco/notix/wq;->k()Lco/notix/ed;

    move-result-object p2

    iput-object p2, p0, Lco/notix/lsi/LockScreenInterstitialWorker;->b:Lco/notix/ed;

    const-string p2, "notification"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/NotificationManager;

    iput-object p1, p0, Lco/notix/lsi/LockScreenInterstitialWorker;->c:Landroid/app/NotificationManager;

    invoke-static {}, Lco/notix/wq;->l()Lco/notix/gd;

    move-result-object p1

    iput-object p1, p0, Lco/notix/lsi/LockScreenInterstitialWorker;->d:Lco/notix/gd;

    return-void
.end method


# virtual methods
.method public final a()Lco/notix/ap;
    .locals 1

    .line 6
    iget-object v0, p0, Lco/notix/lsi/LockScreenInterstitialWorker;->d:Lco/notix/gd;

    return-object v0
.end method

.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lco/notix/hd;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/hd;

    iget v1, v0, Lco/notix/hd;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/hd;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/hd;

    invoke-direct {v0, p0, p1}, Lco/notix/hd;-><init>(Lco/notix/lsi/LockScreenInterstitialWorker;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/hd;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/hd;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lco/notix/hd;->a:Lco/notix/lsi/LockScreenInterstitialWorker;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/lsi/LockScreenInterstitialWorker;->b:Lco/notix/ed;

    iput-object p0, v0, Lco/notix/hd;->a:Lco/notix/lsi/LockScreenInterstitialWorker;

    iput v5, v0, Lco/notix/hd;->d:I

    invoke-virtual {p1, v0}, Lco/notix/ed;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_4

    :cond_5
    iget-object p1, v2, Lco/notix/lsi/LockScreenInterstitialWorker;->a:Lco/notix/mq;

    iput-object v3, v0, Lco/notix/hd;->a:Lco/notix/lsi/LockScreenInterstitialWorker;

    iput v4, v0, Lco/notix/hd;->d:I

    invoke-virtual {p1, v0}, Lco/notix/mq;->d(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    check-cast p1, Lco/notix/mp;

    if-eqz p1, :cond_7

    .line 1
    iget-object p1, p1, Lco/notix/mp;->a:Ljava/lang/Long;

    if-eqz p1, :cond_7

    .line 2
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    .line 3
    new-instance v3, Ljava/lang/Long;

    invoke-direct {v3, v0, v1}, Ljava/lang/Long;-><init>(J)V

    :cond_7
    if-eqz v3, :cond_8

    .line 4
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_4

    :cond_8
    const-wide/32 v0, 0x36ee80

    .line 5
    :goto_4
    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    return-object p1
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lco/notix/id;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lco/notix/id;

    .line 11
    .line 12
    iget v3, v2, Lco/notix/id;->d:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lco/notix/id;->d:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lco/notix/id;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lco/notix/id;-><init>(Lco/notix/lsi/LockScreenInterstitialWorker;LE7/d;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v6, Lco/notix/id;->b:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, LF7/a;->a:LF7/a;

    .line 34
    .line 35
    iget v3, v6, Lco/notix/id;->d:I

    .line 36
    .line 37
    const/4 v9, 0x1

    .line 38
    const v10, 0x49dd513f

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    if-eq v3, v9, :cond_2

    .line 45
    .line 46
    if-ne v3, v4, :cond_1

    .line 47
    .line 48
    iget-object v2, v6, Lco/notix/id;->a:Lco/notix/lsi/LockScreenInterstitialWorker;

    .line 49
    .line 50
    invoke-static {v1}, La/a;->A(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_9

    .line 54
    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    iget-object v3, v6, Lco/notix/id;->a:Lco/notix/lsi/LockScreenInterstitialWorker;

    .line 64
    .line 65
    invoke-static {v1}, La/a;->A(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v11, v3

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-static {v1}, La/a;->A(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v0, Lco/notix/lsi/LockScreenInterstitialWorker;->b:Lco/notix/ed;

    .line 74
    .line 75
    iput-object v0, v6, Lco/notix/id;->a:Lco/notix/lsi/LockScreenInterstitialWorker;

    .line 76
    .line 77
    iput v9, v6, Lco/notix/id;->d:I

    .line 78
    .line 79
    invoke-virtual {v1, v6}, Lco/notix/ed;->b(LE7/d;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-ne v1, v2, :cond_4

    .line 84
    .line 85
    goto/16 :goto_8

    .line 86
    .line 87
    :cond_4
    move-object v11, v0

    .line 88
    :goto_2
    check-cast v1, Ljava/lang/Long;

    .line 89
    .line 90
    iget-object v3, v11, Lco/notix/lsi/LockScreenInterstitialWorker;->c:Landroid/app/NotificationManager;

    .line 91
    .line 92
    invoke-virtual {v3}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-string v5, "notificationManager.activeNotifications"

    .line 97
    .line 98
    invoke-static {v3, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    array-length v5, v3

    .line 102
    const/4 v8, 0x0

    .line 103
    :goto_3
    if-ge v8, v5, :cond_6

    .line 104
    .line 105
    aget-object v12, v3, v8

    .line 106
    .line 107
    invoke-virtual {v12}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    if-ne v12, v10, :cond_5

    .line 112
    .line 113
    move v3, v9

    .line 114
    goto :goto_4

    .line 115
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    const/4 v3, 0x0

    .line 119
    :goto_4
    sget-object v5, Lco/notix/md;->a:Lco/notix/kd;

    .line 120
    .line 121
    new-instance v8, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v12, "LSI: isScreenActive: "

    .line 124
    .line 125
    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v11}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    const-string v13, "display"

    .line 133
    .line 134
    invoke-virtual {v12, v13}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    check-cast v12, Landroid/hardware/display/DisplayManager;

    .line 139
    .line 140
    invoke-static {v12}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    const-string v14, "dm!!.displays"

    .line 148
    .line 149
    invoke-static {v12, v14}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    array-length v15, v12

    .line 153
    const/4 v7, 0x0

    .line 154
    :goto_5
    const/4 v10, 0x4

    .line 155
    if-ge v7, v15, :cond_8

    .line 156
    .line 157
    aget-object v16, v12, v7

    .line 158
    .line 159
    invoke-virtual/range {v16 .. v16}, Landroid/view/Display;->getFlags()I

    .line 160
    .line 161
    .line 162
    move-result v17

    .line 163
    and-int/lit8 v9, v17, 0x4

    .line 164
    .line 165
    if-eq v9, v10, :cond_7

    .line 166
    .line 167
    invoke-virtual/range {v16 .. v16}, Landroid/view/Display;->getState()I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-ne v9, v4, :cond_7

    .line 172
    .line 173
    const/4 v7, 0x1

    .line 174
    goto :goto_6

    .line 175
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 176
    .line 177
    const/4 v9, 0x1

    .line 178
    goto :goto_5

    .line 179
    :cond_8
    const/4 v7, 0x0

    .line 180
    :goto_6
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v7, ", hasActiveLsi: "

    .line 184
    .line 185
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v7, ", zi: "

    .line 192
    .line 193
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    invoke-virtual {v5, v7}, Lco/notix/kd;->b(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v11}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-virtual {v5, v13}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    check-cast v5, Landroid/hardware/display/DisplayManager;

    .line 215
    .line 216
    invoke-static {v5}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-static {v5, v14}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    array-length v7, v5

    .line 227
    const/4 v8, 0x0

    .line 228
    :goto_7
    if-ge v8, v7, :cond_a

    .line 229
    .line 230
    aget-object v9, v5, v8

    .line 231
    .line 232
    invoke-virtual {v9}, Landroid/view/Display;->getFlags()I

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    and-int/2addr v12, v10

    .line 237
    if-eq v12, v10, :cond_9

    .line 238
    .line 239
    invoke-virtual {v9}, Landroid/view/Display;->getState()I

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    if-ne v9, v4, :cond_9

    .line 244
    .line 245
    goto/16 :goto_b

    .line 246
    .line 247
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_a
    if-nez v3, :cond_e

    .line 251
    .line 252
    if-eqz v1, :cond_e

    .line 253
    .line 254
    sget-object v3, Lco/notix/interstitial/NotixInterstitial;->Companion:Lco/notix/interstitial/NotixInterstitial$Companion;

    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 257
    .line 258
    .line 259
    move-result-wide v7

    .line 260
    invoke-virtual {v3, v7, v8}, Lco/notix/interstitial/NotixInterstitial$Companion;->createLoader(J)Lco/notix/interstitial/InterstitialLoader;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-interface {v3}, Lco/notix/interstitial/InterstitialLoader;->startLoading()V

    .line 265
    .line 266
    .line 267
    iput-object v11, v6, Lco/notix/id;->a:Lco/notix/lsi/LockScreenInterstitialWorker;

    .line 268
    .line 269
    iput v4, v6, Lco/notix/id;->d:I

    .line 270
    .line 271
    const/4 v8, 0x0

    .line 272
    const-wide/16 v4, 0x0

    .line 273
    .line 274
    const/4 v7, 0x1

    .line 275
    invoke-static/range {v3 .. v8}, Lco/notix/interstitial/InterstitialLoader$DefaultImpls;->awaitNext$default(Lco/notix/interstitial/InterstitialLoader;JLE7/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    if-ne v1, v2, :cond_b

    .line 280
    .line 281
    :goto_8
    return-object v2

    .line 282
    :cond_b
    move-object v2, v11

    .line 283
    :goto_9
    instance-of v3, v1, Lco/notix/dc;

    .line 284
    .line 285
    if-eqz v3, :cond_c

    .line 286
    .line 287
    check-cast v1, Lco/notix/dc;

    .line 288
    .line 289
    goto :goto_a

    .line 290
    :cond_c
    const/4 v1, 0x0

    .line 291
    :goto_a
    if-eqz v1, :cond_e

    .line 292
    .line 293
    iget-object v3, v1, Lco/notix/dc;->a:Lco/notix/g;

    .line 294
    .line 295
    instance-of v3, v3, Lco/notix/i;

    .line 296
    .line 297
    if-eqz v3, :cond_e

    .line 298
    .line 299
    new-instance v3, Landroid/content/Intent;

    .line 300
    .line 301
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    const-class v5, Lco/notix/lsi/LockScreenInterstitialActivity;

    .line 306
    .line 307
    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 308
    .line 309
    .line 310
    const v4, 0x10008000

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 314
    .line 315
    .line 316
    iget-object v4, v1, Lco/notix/dc;->a:Lco/notix/g;

    .line 317
    .line 318
    check-cast v4, Lco/notix/i;

    .line 319
    .line 320
    iget-object v4, v4, Lco/notix/i;->a:Ljava/lang/String;

    .line 321
    .line 322
    const-string v5, "lsi_title"

    .line 323
    .line 324
    invoke-virtual {v3, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 325
    .line 326
    .line 327
    iget-object v4, v1, Lco/notix/dc;->a:Lco/notix/g;

    .line 328
    .line 329
    check-cast v4, Lco/notix/i;

    .line 330
    .line 331
    iget-object v4, v4, Lco/notix/i;->b:Ljava/lang/String;

    .line 332
    .line 333
    const-string v5, "lsi_desc"

    .line 334
    .line 335
    invoke-virtual {v3, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 336
    .line 337
    .line 338
    iget-object v4, v1, Lco/notix/dc;->a:Lco/notix/g;

    .line 339
    .line 340
    check-cast v4, Lco/notix/i;

    .line 341
    .line 342
    iget-object v4, v4, Lco/notix/i;->g:Ljava/lang/String;

    .line 343
    .line 344
    const-string v5, "lsi_target"

    .line 345
    .line 346
    invoke-virtual {v3, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 347
    .line 348
    .line 349
    iget-object v4, v1, Lco/notix/dc;->a:Lco/notix/g;

    .line 350
    .line 351
    invoke-interface {v4}, Lco/notix/g;->a()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    const-string v5, "lsi_imp"

    .line 356
    .line 357
    invoke-virtual {v3, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 358
    .line 359
    .line 360
    iget-object v4, v1, Lco/notix/dc;->a:Lco/notix/g;

    .line 361
    .line 362
    check-cast v4, Lco/notix/i;

    .line 363
    .line 364
    iget-object v4, v4, Lco/notix/i;->d:Ljava/lang/String;

    .line 365
    .line 366
    const-string v5, "lsi_img"

    .line 367
    .line 368
    invoke-virtual {v3, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 369
    .line 370
    .line 371
    iget-object v4, v1, Lco/notix/dc;->a:Lco/notix/g;

    .line 372
    .line 373
    check-cast v4, Lco/notix/i;

    .line 374
    .line 375
    iget-object v4, v4, Lco/notix/i;->f:Ljava/lang/String;

    .line 376
    .line 377
    const-string v5, "lsi_icon"

    .line 378
    .line 379
    invoke-virtual {v3, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    const-string v5, "applicationContext"

    .line 387
    .line 388
    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    iget-object v1, v1, Lco/notix/dc;->a:Lco/notix/g;

    .line 392
    .line 393
    check-cast v1, Lco/notix/i;

    .line 394
    .line 395
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 396
    .line 397
    sget-object v6, LR7/d;->a:LR7/a;

    .line 398
    .line 399
    invoke-virtual {v6}, LR7/a;->b()I

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    const/high16 v7, 0xc000000

    .line 404
    .line 405
    invoke-static {v4, v6, v3, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    const/16 v6, 0x1a

    .line 410
    .line 411
    if-lt v5, v6, :cond_d

    .line 412
    .line 413
    invoke-static {}, LB4/e;->b()Landroid/app/NotificationChannel;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    iget-object v6, v2, Lco/notix/lsi/LockScreenInterstitialWorker;->c:Landroid/app/NotificationManager;

    .line 418
    .line 419
    invoke-static {v6, v5}, LB4/e;->t(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 420
    .line 421
    .line 422
    :cond_d
    new-instance v5, LD/m;

    .line 423
    .line 424
    const-string v6, "notix_lsi"

    .line 425
    .line 426
    invoke-direct {v5, v4, v6}, LD/m;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    iget v4, v4, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 434
    .line 435
    iget-object v6, v5, LD/m;->w:Landroid/app/Notification;

    .line 436
    .line 437
    iput v4, v6, Landroid/app/Notification;->icon:I

    .line 438
    .line 439
    const/4 v4, 0x1

    .line 440
    iput v4, v5, LD/m;->k:I

    .line 441
    .line 442
    const-string v6, "alarm"

    .line 443
    .line 444
    iput-object v6, v5, LD/m;->p:Ljava/lang/String;

    .line 445
    .line 446
    iput v4, v5, LD/m;->u:I

    .line 447
    .line 448
    iget-object v4, v1, Lco/notix/i;->b:Ljava/lang/String;

    .line 449
    .line 450
    invoke-static {v4}, LD/m;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    iput-object v4, v5, LD/m;->f:Ljava/lang/CharSequence;

    .line 455
    .line 456
    iget-object v1, v1, Lco/notix/i;->a:Ljava/lang/String;

    .line 457
    .line 458
    invoke-static {v1}, LD/m;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    iput-object v1, v5, LD/m;->e:Ljava/lang/CharSequence;

    .line 463
    .line 464
    const/16 v1, 0x10

    .line 465
    .line 466
    const/4 v4, 0x1

    .line 467
    invoke-virtual {v5, v1, v4}, LD/m;->c(IZ)V

    .line 468
    .line 469
    .line 470
    iput-object v3, v5, LD/m;->h:Landroid/app/PendingIntent;

    .line 471
    .line 472
    const/16 v1, 0x80

    .line 473
    .line 474
    invoke-virtual {v5, v1, v4}, LD/m;->c(IZ)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v5}, LD/m;->a()Landroid/app/Notification;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    const-string v3, "Builder(context, CHANNEL\u2026rue)\n            .build()"

    .line 482
    .line 483
    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    iget-object v2, v2, Lco/notix/lsi/LockScreenInterstitialWorker;->c:Landroid/app/NotificationManager;

    .line 487
    .line 488
    const v3, 0x49dd513f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2, v3, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 492
    .line 493
    .line 494
    :cond_e
    :goto_b
    sget-object v1, Lco/notix/nr;->a:Lco/notix/nr;

    .line 495
    .line 496
    return-object v1
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
.end method
