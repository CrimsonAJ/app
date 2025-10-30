.class public final synthetic Lj2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/b;
.implements Ll4/i;
.implements Lq3/c;
.implements Ls6/d;
.implements LS6/a;
.implements Lz5/i;
.implements LO5/f;
.implements Lf5/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lj2/b;->a:I

    iput-object p2, p0, Lj2/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk3/a;LN3/q;LN3/v;Ljava/io/IOException;Z)V
    .locals 0

    .line 2
    const/16 p1, 0x8

    iput p1, p0, Lj2/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lj2/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lk3/a;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Lj2/b;->a:I

    iput-object p2, p0, Lj2/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lt0/X;Lt0/W;)V
    .locals 0

    .line 4
    const/16 p2, 0xe

    iput p2, p0, Lj2/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj2/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/Display;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm4/t;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/Display;->getRefreshRate()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    float-to-double v1, p1

    .line 15
    const-wide v3, 0x41cdcd6500000000L    # 1.0E9

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    div-double/2addr v3, v1

    .line 21
    double-to-long v1, v3

    .line 22
    iput-wide v1, v0, Lm4/t;->k:J

    .line 23
    .line 24
    const-wide/16 v3, 0x50

    .line 25
    .line 26
    mul-long/2addr v1, v3

    .line 27
    const-wide/16 v3, 0x64

    .line 28
    .line 29
    div-long/2addr v1, v3

    .line 30
    iput-wide v1, v0, Lm4/t;->l:J

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const-string p1, "VideoFrameReleaseHelper"

    .line 34
    .line 35
    const-string v1, "Unable to query display refresh rate"

    .line 36
    .line 37
    invoke-static {p1, v1}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    iput-wide v1, v0, Lm4/t;->k:J

    .line 46
    .line 47
    iput-wide v1, v0, Lm4/t;->l:J

    .line 48
    .line 49
    return-void
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
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ly3/o;

    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    check-cast v0, Ly3/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public d(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/anilab/android/ui/register/RegisterFragment;

    .line 4
    .line 5
    check-cast p1, Lf/a;

    .line 6
    .line 7
    iget v1, p1, Lf/a;->a:I

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    if-ne v1, v2, :cond_2

    .line 11
    .line 12
    :try_start_0
    iget-object p1, p1, Lf/a;->b:Landroid/content/Intent;

    .line 13
    .line 14
    invoke-static {p1}, Ls8/e;->F(Landroid/content/Intent;)Lf5/q;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-class v1, LC4/e;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lf5/q;->h(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->c:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object v1, v0, Lcom/anilab/android/ui/register/RegisterFragment;->D0:LY2/r;

    .line 31
    .line 32
    invoke-virtual {v1}, LY2/r;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lj2/j;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Lj2/h;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {v2, v1, p1, v3}, Lj2/h;-><init>(Lj2/j;Ljava/lang/String;LE7/d;)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    invoke-virtual {v1, p1, v2}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    new-instance p1, LM1/D;

    .line 53
    .line 54
    const v1, 0x7f140142

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, v1}, LM1/D;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, LM1/n;->o0(LM1/E;)V
    :try_end_0
    .catch LC4/e; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catch_0
    move-exception p1

    .line 65
    iget-object p1, p1, LC4/e;->a:Lcom/google/android/gms/common/api/Status;

    .line 66
    .line 67
    iget p1, p1, Lcom/google/android/gms/common/api/Status;->a:I

    .line 68
    .line 69
    const/4 v1, 0x7

    .line 70
    if-ne p1, v1, :cond_1

    .line 71
    .line 72
    new-instance p1, LM1/D;

    .line 73
    .line 74
    const v1, 0x7f140143

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, v1}, LM1/D;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p1}, LM1/n;->o0(LM1/E;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    new-instance p1, LM1/D;

    .line 85
    .line 86
    const v1, 0x7f140180

    .line 87
    .line 88
    .line 89
    invoke-direct {p1, v1}, LM1/D;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p1}, LM1/n;->o0(LM1/E;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    :goto_0
    return-void
    .line 96
.end method

.method public e(LY2/r;)Ljava/lang/Object;
    .locals 56

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget v10, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->d:I

    .line 4
    .line 5
    move-object/from16 v10, p0

    .line 6
    .line 7
    iget-object v11, v10, Lj2/b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v11, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;

    .line 10
    .line 11
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v12

    .line 18
    const-class v14, Ll6/f;

    .line 19
    .line 20
    invoke-virtual {v0, v14}, LY2/r;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v14

    .line 24
    check-cast v14, Ll6/f;

    .line 25
    .line 26
    const-class v15, LT6/e;

    .line 27
    .line 28
    invoke-virtual {v0, v15}, LY2/r;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v15

    .line 32
    check-cast v15, LT6/e;

    .line 33
    .line 34
    const-class v5, Lv6/a;

    .line 35
    .line 36
    invoke-virtual {v0, v5}, LY2/r;->C(Ljava/lang/Class;)Ls6/n;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const-class v1, Lp6/b;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, LY2/r;->C(Ljava/lang/Class;)Ls6/n;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/16 v26, 0x1

    .line 47
    .line 48
    const-class v9, Lf7/a;

    .line 49
    .line 50
    invoke-virtual {v0, v9}, LY2/r;->C(Ljava/lang/Class;)Ls6/n;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    iget-object v2, v11, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Ls6/p;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, LY2/r;->d(Ls6/p;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/util/concurrent/ExecutorService;

    .line 61
    .line 62
    iget-object v3, v11, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Ls6/p;

    .line 63
    .line 64
    invoke-virtual {v0, v3}, LY2/r;->d(Ls6/p;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 69
    .line 70
    iget-object v11, v11, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:Ls6/p;

    .line 71
    .line 72
    invoke-virtual {v0, v11}, LY2/r;->d(Ls6/p;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 77
    .line 78
    invoke-virtual {v14}, Ll6/f;->a()V

    .line 79
    .line 80
    .line 81
    iget-object v11, v14, Ll6/f;->a:Landroid/content/Context;

    .line 82
    .line 83
    const/16 v28, 0x2

    .line 84
    .line 85
    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    new-instance v4, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const/16 v29, 0x0

    .line 92
    .line 93
    const-string v8, "Initializing Firebase Crashlytics 19.4.4 for "

    .line 94
    .line 95
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const-string v8, "FirebaseCrashlytics"

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    invoke-static {v8, v4, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 109
    .line 110
    .line 111
    new-instance v4, Lz6/d;

    .line 112
    .line 113
    invoke-direct {v4, v2, v3}, Lz6/d;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V

    .line 114
    .line 115
    .line 116
    new-instance v2, LE6/e;

    .line 117
    .line 118
    invoke-direct {v2, v11}, LE6/e;-><init>(Landroid/content/Context;)V

    .line 119
    .line 120
    .line 121
    new-instance v3, LD4/v;

    .line 122
    .line 123
    invoke-direct {v3, v14}, LD4/v;-><init>(Ll6/f;)V

    .line 124
    .line 125
    .line 126
    new-instance v7, Ly6/u;

    .line 127
    .line 128
    invoke-direct {v7, v11, v6, v15, v3}, Ly6/u;-><init>(Landroid/content/Context;Ljava/lang/String;LT6/e;LD4/v;)V

    .line 129
    .line 130
    .line 131
    new-instance v6, Lv6/a;

    .line 132
    .line 133
    invoke-direct {v6, v5}, Lv6/a;-><init>(Ls6/n;)V

    .line 134
    .line 135
    .line 136
    new-instance v5, Ld0/f;

    .line 137
    .line 138
    invoke-direct {v5, v1}, Ld0/f;-><init>(Ls6/n;)V

    .line 139
    .line 140
    .line 141
    new-instance v1, Ly6/i;

    .line 142
    .line 143
    invoke-direct {v1, v3, v2}, Ly6/i;-><init>(LD4/v;LE6/e;)V

    .line 144
    .line 145
    .line 146
    sget-object v15, Lj7/c;->a:Lj7/c;

    .line 147
    .line 148
    sget-object v15, Lj7/d;->a:Lj7/d;

    .line 149
    .line 150
    sget-object v16, Lj7/c;->a:Lj7/c;

    .line 151
    .line 152
    move-object/from16 v22, v2

    .line 153
    .line 154
    invoke-static {v15}, Lj7/c;->a(Lj7/d;)Lj7/a;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    move-object/from16 v19, v3

    .line 159
    .line 160
    iget-object v3, v2, Lj7/a;->b:Ly6/i;

    .line 161
    .line 162
    move-object/from16 v16, v3

    .line 163
    .line 164
    const-string v3, "Subscriber "

    .line 165
    .line 166
    move-object/from16 v25, v4

    .line 167
    .line 168
    const-string v4, "SessionsDependencies"

    .line 169
    .line 170
    if-eqz v16, :cond_0

    .line 171
    .line 172
    new-instance v2, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v3, " already registered."

    .line 181
    .line 182
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-object/from16 v23, v1

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_0
    iput-object v1, v2, Lj7/a;->b:Ly6/i;

    .line 196
    .line 197
    move-object/from16 v23, v1

    .line 198
    .line 199
    new-instance v1, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v3, " registered."

    .line 208
    .line 209
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    iget-object v1, v2, Lj7/a;->a:Lg8/d;

    .line 220
    .line 221
    const/4 v2, 0x0

    .line 222
    invoke-virtual {v1, v2}, Lg8/d;->a(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :goto_0
    new-instance v1, Lf5/o;

    .line 226
    .line 227
    const/16 v2, 0x14

    .line 228
    .line 229
    invoke-direct {v1, v2, v9}, Lf5/o;-><init>(ILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    new-instance v15, Ly6/p;

    .line 233
    .line 234
    new-instance v2, Lu6/a;

    .line 235
    .line 236
    invoke-direct {v2, v5}, Lu6/a;-><init>(Ld0/f;)V

    .line 237
    .line 238
    .line 239
    new-instance v3, Lu6/a;

    .line 240
    .line 241
    invoke-direct {v3, v5}, Lu6/a;-><init>(Ld0/f;)V

    .line 242
    .line 243
    .line 244
    move-object/from16 v24, v1

    .line 245
    .line 246
    move-object/from16 v20, v2

    .line 247
    .line 248
    move-object/from16 v21, v3

    .line 249
    .line 250
    move-object/from16 v18, v6

    .line 251
    .line 252
    move-object/from16 v17, v7

    .line 253
    .line 254
    move-object/from16 v16, v14

    .line 255
    .line 256
    invoke-direct/range {v15 .. v25}, Ly6/p;-><init>(Ll6/f;Ly6/u;Lv6/a;LD4/v;Lu6/a;Lu6/a;LE6/e;Ly6/i;Lf5/o;Lz6/d;)V

    .line 257
    .line 258
    .line 259
    move-object/from16 v14, v16

    .line 260
    .line 261
    move-object/from16 v3, v19

    .line 262
    .line 263
    move-object/from16 v2, v22

    .line 264
    .line 265
    move-object/from16 v1, v25

    .line 266
    .line 267
    iget-object v4, v15, Ly6/p;->o:Lz6/d;

    .line 268
    .line 269
    invoke-virtual {v14}, Ll6/f;->a()V

    .line 270
    .line 271
    .line 272
    iget-object v5, v14, Ll6/f;->c:Ll6/i;

    .line 273
    .line 274
    iget-object v5, v5, Ll6/i;->b:Ljava/lang/String;

    .line 275
    .line 276
    const-string v6, "com.google.firebase.crashlytics.mapping_file_id"

    .line 277
    .line 278
    const-string v7, "string"

    .line 279
    .line 280
    invoke-static {v11, v6, v7}, Ly6/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    if-nez v6, :cond_1

    .line 285
    .line 286
    const-string v6, "com.crashlytics.android.build_id"

    .line 287
    .line 288
    invoke-static {v11, v6, v7}, Ly6/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    :cond_1
    if-eqz v6, :cond_2

    .line 293
    .line 294
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    invoke-virtual {v7, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    goto :goto_1

    .line 303
    :cond_2
    const/4 v6, 0x0

    .line 304
    :goto_1
    new-instance v7, Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 307
    .line 308
    .line 309
    const-string v9, "com.google.firebase.crashlytics.build_ids_lib"

    .line 310
    .line 311
    const-string v14, "array"

    .line 312
    .line 313
    invoke-static {v11, v9, v14}, Ly6/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    move-object/from16 v31, v5

    .line 318
    .line 319
    const-string v5, "com.google.firebase.crashlytics.build_ids_arch"

    .line 320
    .line 321
    invoke-static {v11, v5, v14}, Ly6/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    const-string v10, "com.google.firebase.crashlytics.build_ids_build_id"

    .line 326
    .line 327
    invoke-static {v11, v10, v14}, Ly6/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 328
    .line 329
    .line 330
    move-result v10

    .line 331
    if-eqz v9, :cond_3

    .line 332
    .line 333
    if-eqz v5, :cond_3

    .line 334
    .line 335
    if-nez v10, :cond_4

    .line 336
    .line 337
    :cond_3
    move-object/from16 v41, v4

    .line 338
    .line 339
    move-wide/from16 v39, v12

    .line 340
    .line 341
    goto/16 :goto_5

    .line 342
    .line 343
    :cond_4
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 344
    .line 345
    .line 346
    move-result-object v14

    .line 347
    invoke-virtual {v14, v9}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 352
    .line 353
    .line 354
    move-result-object v14

    .line 355
    invoke-virtual {v14, v5}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 360
    .line 361
    .line 362
    move-result-object v14

    .line 363
    invoke-virtual {v14, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v10

    .line 367
    array-length v14, v9

    .line 368
    move-wide/from16 v39, v12

    .line 369
    .line 370
    array-length v12, v10

    .line 371
    if-ne v14, v12, :cond_5

    .line 372
    .line 373
    array-length v12, v5

    .line 374
    array-length v13, v10

    .line 375
    if-eq v12, v13, :cond_6

    .line 376
    .line 377
    :cond_5
    move-object/from16 v41, v4

    .line 378
    .line 379
    goto :goto_4

    .line 380
    :cond_6
    move/from16 v12, v29

    .line 381
    .line 382
    :goto_2
    array-length v13, v10

    .line 383
    if-ge v12, v13, :cond_7

    .line 384
    .line 385
    new-instance v13, Ly6/d;

    .line 386
    .line 387
    aget-object v14, v9, v12

    .line 388
    .line 389
    move/from16 v16, v12

    .line 390
    .line 391
    aget-object v12, v5, v16

    .line 392
    .line 393
    move-object/from16 v41, v4

    .line 394
    .line 395
    aget-object v4, v10, v16

    .line 396
    .line 397
    invoke-direct {v13, v14, v12, v4}, Ly6/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    add-int/lit8 v12, v16, 0x1

    .line 404
    .line 405
    move-object/from16 v4, v41

    .line 406
    .line 407
    goto :goto_2

    .line 408
    :cond_7
    move-object/from16 v41, v4

    .line 409
    .line 410
    :cond_8
    :goto_3
    const/4 v5, 0x0

    .line 411
    const/4 v10, 0x3

    .line 412
    goto :goto_6

    .line 413
    :goto_4
    array-length v4, v9

    .line 414
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    array-length v5, v5

    .line 419
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    array-length v9, v10

    .line 424
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    const/4 v10, 0x3

    .line 429
    new-array v12, v10, [Ljava/lang/Object;

    .line 430
    .line 431
    aput-object v4, v12, v29

    .line 432
    .line 433
    aput-object v5, v12, v26

    .line 434
    .line 435
    aput-object v9, v12, v28

    .line 436
    .line 437
    const-string v4, "Lengths did not match: %d %d %d"

    .line 438
    .line 439
    invoke-static {v4, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    invoke-static {v8, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 444
    .line 445
    .line 446
    move-result v5

    .line 447
    if-eqz v5, :cond_8

    .line 448
    .line 449
    const/4 v5, 0x0

    .line 450
    invoke-static {v8, v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 451
    .line 452
    .line 453
    goto :goto_3

    .line 454
    :goto_5
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 459
    .line 460
    .line 461
    move-result-object v5

    .line 462
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v9

    .line 466
    const/4 v10, 0x3

    .line 467
    new-array v12, v10, [Ljava/lang/Object;

    .line 468
    .line 469
    aput-object v4, v12, v29

    .line 470
    .line 471
    aput-object v5, v12, v26

    .line 472
    .line 473
    aput-object v9, v12, v28

    .line 474
    .line 475
    const-string v4, "Could not find resources: %d %d %d"

    .line 476
    .line 477
    invoke-static {v4, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    invoke-static {v8, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 482
    .line 483
    .line 484
    move-result v5

    .line 485
    if-eqz v5, :cond_9

    .line 486
    .line 487
    const/4 v5, 0x0

    .line 488
    invoke-static {v8, v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 489
    .line 490
    .line 491
    goto :goto_6

    .line 492
    :cond_9
    const/4 v5, 0x0

    .line 493
    :goto_6
    const-string v4, "Mapping file ID is: "

    .line 494
    .line 495
    invoke-static {v4, v6}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    invoke-static {v8, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 500
    .line 501
    .line 502
    move-result v9

    .line 503
    if-eqz v9, :cond_a

    .line 504
    .line 505
    invoke-static {v8, v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 506
    .line 507
    .line 508
    :cond_a
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 509
    .line 510
    .line 511
    move-result v4

    .line 512
    move/from16 v5, v29

    .line 513
    .line 514
    :cond_b
    :goto_7
    if-ge v5, v4, :cond_c

    .line 515
    .line 516
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v9

    .line 520
    add-int/lit8 v5, v5, 0x1

    .line 521
    .line 522
    check-cast v9, Ly6/d;

    .line 523
    .line 524
    iget-object v10, v9, Ly6/d;->a:Ljava/lang/String;

    .line 525
    .line 526
    const-string v12, "Build id for "

    .line 527
    .line 528
    const-string v13, " on "

    .line 529
    .line 530
    invoke-static {v12, v10, v13}, Lcom/google/android/gms/internal/measurement/k1;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    move-result-object v10

    .line 534
    iget-object v12, v9, Ly6/d;->b:Ljava/lang/String;

    .line 535
    .line 536
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    const-string v12, ": "

    .line 540
    .line 541
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    iget-object v9, v9, Ly6/d;->c:Ljava/lang/String;

    .line 545
    .line 546
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    const/4 v10, 0x3

    .line 554
    invoke-static {v8, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 555
    .line 556
    .line 557
    move-result v12

    .line 558
    if-eqz v12, :cond_b

    .line 559
    .line 560
    const/4 v10, 0x0

    .line 561
    invoke-static {v8, v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 562
    .line 563
    .line 564
    goto :goto_7

    .line 565
    :cond_c
    new-instance v4, Lk4/E;

    .line 566
    .line 567
    invoke-direct {v4, v11}, Lk4/E;-><init>(Landroid/content/Context;)V

    .line 568
    .line 569
    .line 570
    :try_start_0
    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v5

    .line 574
    invoke-virtual/range {v17 .. v17}, Ly6/u;->d()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v34

    .line 578
    invoke-virtual {v11}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 579
    .line 580
    .line 581
    move-result-object v9

    .line 582
    move/from16 v10, v29

    .line 583
    .line 584
    invoke-virtual {v9, v5, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 585
    .line 586
    .line 587
    move-result-object v9

    .line 588
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 589
    .line 590
    const/16 v12, 0x1c

    .line 591
    .line 592
    if-lt v10, v12, :cond_d

    .line 593
    .line 594
    invoke-static {v9}, Lp0/b;->b(Landroid/content/pm/PackageInfo;)J

    .line 595
    .line 596
    .line 597
    move-result-wide v12

    .line 598
    invoke-static {v12, v13}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v10

    .line 602
    :goto_8
    move-object/from16 v24, v10

    .line 603
    .line 604
    goto :goto_9

    .line 605
    :cond_d
    iget v10, v9, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 606
    .line 607
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v10

    .line 611
    goto :goto_8

    .line 612
    :goto_9
    iget-object v9, v9, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 613
    .line 614
    if-nez v9, :cond_e

    .line 615
    .line 616
    const-string v9, "0.0"

    .line 617
    .line 618
    :cond_e
    move-object/from16 v23, v9

    .line 619
    .line 620
    new-instance v45, Ly6/a;

    .line 621
    .line 622
    move-object/from16 v38, v4

    .line 623
    .line 624
    move-object/from16 v35, v5

    .line 625
    .line 626
    move-object/from16 v32, v6

    .line 627
    .line 628
    move-object/from16 v33, v7

    .line 629
    .line 630
    move-object/from16 v37, v23

    .line 631
    .line 632
    move-object/from16 v36, v24

    .line 633
    .line 634
    move-object/from16 v30, v45

    .line 635
    .line 636
    invoke-direct/range {v30 .. v38}, Ly6/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lk4/E;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 637
    .line 638
    .line 639
    move-object/from16 v6, v30

    .line 640
    .line 641
    move-object/from16 v4, v31

    .line 642
    .line 643
    move-object/from16 v5, v34

    .line 644
    .line 645
    move-object/from16 v10, v36

    .line 646
    .line 647
    move-object/from16 v9, v37

    .line 648
    .line 649
    const-string v7, "Installer package name is: "

    .line 650
    .line 651
    invoke-static {v7, v5}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v5

    .line 655
    move/from16 v7, v28

    .line 656
    .line 657
    invoke-static {v8, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 658
    .line 659
    .line 660
    move-result v12

    .line 661
    if-eqz v12, :cond_f

    .line 662
    .line 663
    const/4 v7, 0x0

    .line 664
    invoke-static {v8, v5, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 665
    .line 666
    .line 667
    :cond_f
    new-instance v5, Lz2/a;

    .line 668
    .line 669
    const/4 v7, 0x4

    .line 670
    invoke-direct {v5, v7}, Lz2/a;-><init>(I)V

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v17 .. v17}, Ly6/u;->d()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v7

    .line 677
    new-instance v12, Ld0/o;

    .line 678
    .line 679
    const/16 v13, 0x11

    .line 680
    .line 681
    invoke-direct {v12, v13}, Ld0/o;-><init>(I)V

    .line 682
    .line 683
    .line 684
    new-instance v13, Lb7/c;

    .line 685
    .line 686
    const/4 v14, 0x7

    .line 687
    invoke-direct {v13, v14, v12}, Lb7/c;-><init>(ILjava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    new-instance v14, Lo1/f;

    .line 691
    .line 692
    invoke-direct {v14, v2}, Lo1/f;-><init>(LE6/e;)V

    .line 693
    .line 694
    .line 695
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 696
    .line 697
    const-string v2, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/"

    .line 698
    .line 699
    move-object/from16 v16, v7

    .line 700
    .line 701
    const-string v7, "/settings"

    .line 702
    .line 703
    invoke-static {v2, v4, v7}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    new-instance v7, LG6/a;

    .line 708
    .line 709
    invoke-direct {v7, v2, v5}, LG6/a;-><init>(Ljava/lang/String;Lz2/a;)V

    .line 710
    .line 711
    .line 712
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 713
    .line 714
    sget-object v5, Ly6/u;->h:Ljava/lang/String;

    .line 715
    .line 716
    move-object/from16 v30, v6

    .line 717
    .line 718
    const-string v6, ""

    .line 719
    .line 720
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 725
    .line 726
    move-object/from16 v31, v8

    .line 727
    .line 728
    const-string v8, ""

    .line 729
    .line 730
    invoke-virtual {v6, v5, v8}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v6

    .line 734
    const-string v8, "/"

    .line 735
    .line 736
    invoke-static {v2, v8, v6}, Lcom/google/android/gms/internal/measurement/k1;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v18

    .line 740
    sget-object v2, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    .line 741
    .line 742
    const-string v6, ""

    .line 743
    .line 744
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v19

    .line 748
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 749
    .line 750
    const-string v6, ""

    .line 751
    .line 752
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v20

    .line 756
    const-string v2, "com.google.firebase.crashlytics.mapping_file_id"

    .line 757
    .line 758
    const-string v5, "string"

    .line 759
    .line 760
    invoke-static {v11, v2, v5}, Ly6/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    if-nez v2, :cond_10

    .line 765
    .line 766
    const-string v2, "com.crashlytics.android.build_id"

    .line 767
    .line 768
    invoke-static {v11, v2, v5}, Ly6/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 769
    .line 770
    .line 771
    move-result v2

    .line 772
    :cond_10
    if-eqz v2, :cond_11

    .line 773
    .line 774
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    goto :goto_a

    .line 783
    :cond_11
    const/4 v2, 0x0

    .line 784
    :goto_a
    filled-new-array {v2, v4, v9, v10}, [Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    new-instance v5, Ljava/util/ArrayList;

    .line 789
    .line 790
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 791
    .line 792
    .line 793
    const/4 v6, 0x0

    .line 794
    :goto_b
    const-string v8, ""

    .line 795
    .line 796
    move-object/from16 v21, v2

    .line 797
    .line 798
    const/4 v2, 0x4

    .line 799
    if-ge v6, v2, :cond_13

    .line 800
    .line 801
    aget-object v2, v21, v6

    .line 802
    .line 803
    move-object/from16 v22, v4

    .line 804
    .line 805
    if-eqz v2, :cond_12

    .line 806
    .line 807
    const-string v4, "-"

    .line 808
    .line 809
    invoke-virtual {v2, v4, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 814
    .line 815
    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v2

    .line 819
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    :cond_12
    add-int/lit8 v6, v6, 0x1

    .line 823
    .line 824
    move-object/from16 v2, v21

    .line 825
    .line 826
    move-object/from16 v4, v22

    .line 827
    .line 828
    goto :goto_b

    .line 829
    :cond_13
    move-object/from16 v22, v4

    .line 830
    .line 831
    invoke-static {v5}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 832
    .line 833
    .line 834
    new-instance v2, Ljava/lang/StringBuilder;

    .line 835
    .line 836
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 840
    .line 841
    .line 842
    move-result v4

    .line 843
    const/4 v6, 0x0

    .line 844
    :goto_c
    if-ge v6, v4, :cond_14

    .line 845
    .line 846
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v21

    .line 850
    add-int/lit8 v6, v6, 0x1

    .line 851
    .line 852
    move/from16 v23, v4

    .line 853
    .line 854
    move-object/from16 v4, v21

    .line 855
    .line 856
    check-cast v4, Ljava/lang/String;

    .line 857
    .line 858
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 859
    .line 860
    .line 861
    move/from16 v4, v23

    .line 862
    .line 863
    goto :goto_c

    .line 864
    :cond_14
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v2

    .line 868
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 869
    .line 870
    .line 871
    move-result v4

    .line 872
    if-lez v4, :cond_15

    .line 873
    .line 874
    invoke-static {v2}, Ly6/g;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    move-object/from16 v4, v22

    .line 879
    .line 880
    move-object/from16 v22, v2

    .line 881
    .line 882
    goto :goto_d

    .line 883
    :cond_15
    move-object/from16 v4, v22

    .line 884
    .line 885
    const/16 v22, 0x0

    .line 886
    .line 887
    :goto_d
    if-eqz v16, :cond_16

    .line 888
    .line 889
    const/16 v27, 0x4

    .line 890
    .line 891
    goto :goto_e

    .line 892
    :cond_16
    move/from16 v27, v26

    .line 893
    .line 894
    :goto_e
    new-instance v16, LG6/g;

    .line 895
    .line 896
    invoke-static/range {v27 .. v27}, Lu0/z;->a(I)I

    .line 897
    .line 898
    .line 899
    move-result v25

    .line 900
    move-object/from16 v23, v9

    .line 901
    .line 902
    move-object/from16 v24, v10

    .line 903
    .line 904
    move-object/from16 v21, v17

    .line 905
    .line 906
    move-object/from16 v17, v4

    .line 907
    .line 908
    invoke-direct/range {v16 .. v25}, LG6/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 909
    .line 910
    .line 911
    move-object/from16 v2, v16

    .line 912
    .line 913
    new-instance v4, LG6/e;

    .line 914
    .line 915
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 916
    .line 917
    .line 918
    new-instance v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 919
    .line 920
    invoke-direct {v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 921
    .line 922
    .line 923
    iput-object v5, v4, LG6/e;->h:Ljava/lang/Object;

    .line 924
    .line 925
    new-instance v6, Ljava/util/concurrent/atomic/AtomicReference;

    .line 926
    .line 927
    new-instance v9, Lf5/i;

    .line 928
    .line 929
    invoke-direct {v9}, Lf5/i;-><init>()V

    .line 930
    .line 931
    .line 932
    invoke-direct {v6, v9}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    iput-object v6, v4, LG6/e;->i:Ljava/lang/Object;

    .line 936
    .line 937
    iput-object v11, v4, LG6/e;->a:Ljava/lang/Object;

    .line 938
    .line 939
    iput-object v2, v4, LG6/e;->b:Ljava/lang/Object;

    .line 940
    .line 941
    iput-object v12, v4, LG6/e;->d:Ljava/lang/Object;

    .line 942
    .line 943
    iput-object v13, v4, LG6/e;->c:Ljava/lang/Object;

    .line 944
    .line 945
    iput-object v14, v4, LG6/e;->e:Ljava/lang/Object;

    .line 946
    .line 947
    iput-object v7, v4, LG6/e;->f:Ljava/lang/Object;

    .line 948
    .line 949
    iput-object v3, v4, LG6/e;->g:Ljava/lang/Object;

    .line 950
    .line 951
    invoke-static {v12}, LF5/e;->n(Ld0/o;)LG6/c;

    .line 952
    .line 953
    .line 954
    move-result-object v2

    .line 955
    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 956
    .line 957
    .line 958
    iget-object v2, v4, LG6/e;->a:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast v2, Landroid/content/Context;

    .line 961
    .line 962
    const-string v3, "com.google.firebase.crashlytics"

    .line 963
    .line 964
    const/4 v10, 0x0

    .line 965
    invoke-virtual {v2, v3, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    const-string v3, "existing_instance_identifier"

    .line 970
    .line 971
    invoke-interface {v2, v3, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    iget-object v3, v4, LG6/e;->b:Ljava/lang/Object;

    .line 976
    .line 977
    check-cast v3, LG6/g;

    .line 978
    .line 979
    iget-object v3, v3, LG6/g;->f:Ljava/lang/String;

    .line 980
    .line 981
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 982
    .line 983
    .line 984
    move-result v2

    .line 985
    iget-object v3, v4, LG6/e;->i:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 988
    .line 989
    iget-object v5, v4, LG6/e;->h:Ljava/lang/Object;

    .line 990
    .line 991
    check-cast v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 992
    .line 993
    if-eqz v2, :cond_17

    .line 994
    .line 995
    move/from16 v2, v26

    .line 996
    .line 997
    invoke-virtual {v4, v2}, LG6/e;->e(I)LG6/c;

    .line 998
    .line 999
    .line 1000
    move-result-object v6

    .line 1001
    if-eqz v6, :cond_17

    .line 1002
    .line 1003
    invoke-virtual {v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v1

    .line 1010
    check-cast v1, Lf5/i;

    .line 1011
    .line 1012
    invoke-virtual {v1, v6}, Lf5/i;->d(Ljava/lang/Object;)V

    .line 1013
    .line 1014
    .line 1015
    const/4 v5, 0x0

    .line 1016
    invoke-static {v5}, Ls8/n;->p(Ljava/lang/Object;)Lf5/q;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v1

    .line 1020
    goto :goto_f

    .line 1021
    :cond_17
    const/4 v10, 0x3

    .line 1022
    invoke-virtual {v4, v10}, LG6/e;->e(I)LG6/c;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v2

    .line 1026
    if-eqz v2, :cond_18

    .line 1027
    .line 1028
    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v3

    .line 1035
    check-cast v3, Lf5/i;

    .line 1036
    .line 1037
    invoke-virtual {v3, v2}, Lf5/i;->d(Ljava/lang/Object;)V

    .line 1038
    .line 1039
    .line 1040
    :cond_18
    iget-object v2, v4, LG6/e;->g:Ljava/lang/Object;

    .line 1041
    .line 1042
    check-cast v2, LD4/v;

    .line 1043
    .line 1044
    iget-object v3, v2, LD4/v;->f:Ljava/lang/Object;

    .line 1045
    .line 1046
    check-cast v3, Lf5/i;

    .line 1047
    .line 1048
    iget-object v3, v3, Lf5/i;->a:Lf5/q;

    .line 1049
    .line 1050
    iget-object v5, v2, LD4/v;->c:Ljava/lang/Object;

    .line 1051
    .line 1052
    monitor-enter v5

    .line 1053
    :try_start_1
    iget-object v2, v2, LD4/v;->d:Ljava/lang/Object;

    .line 1054
    .line 1055
    check-cast v2, Lf5/i;

    .line 1056
    .line 1057
    iget-object v2, v2, Lf5/i;->a:Lf5/q;

    .line 1058
    .line 1059
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1060
    invoke-static {v3, v2}, Lz6/a;->a(Lf5/h;Lf5/h;)Lf5/q;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v2

    .line 1064
    new-instance v3, LA1/g;

    .line 1065
    .line 1066
    const/16 v5, 0x16

    .line 1067
    .line 1068
    const/4 v10, 0x0

    .line 1069
    invoke-direct {v3, v4, v1, v5, v10}, LA1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 1070
    .line 1071
    .line 1072
    iget-object v1, v1, Lz6/d;->a:Lz6/b;

    .line 1073
    .line 1074
    invoke-virtual {v2, v1, v3}, Lf5/q;->m(Ljava/util/concurrent/Executor;Lf5/g;)Lf5/q;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    :goto_f
    new-instance v2, Lk8/a;

    .line 1079
    .line 1080
    const/16 v3, 0x12

    .line 1081
    .line 1082
    invoke-direct {v2, v3}, Lk8/a;-><init>(I)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v1, v0, v2}, Lf5/q;->c(Ljava/util/concurrent/Executor;Lf5/d;)Lf5/q;

    .line 1086
    .line 1087
    .line 1088
    iget-object v0, v15, Ly6/p;->i:LE6/e;

    .line 1089
    .line 1090
    iget-object v1, v15, Ly6/p;->a:Landroid/content/Context;

    .line 1091
    .line 1092
    if-eqz v1, :cond_1a

    .line 1093
    .line 1094
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v2

    .line 1098
    if-eqz v2, :cond_1a

    .line 1099
    .line 1100
    const-string v3, "bool"

    .line 1101
    .line 1102
    const-string v5, "com.crashlytics.RequireBuildId"

    .line 1103
    .line 1104
    invoke-static {v1, v5, v3}, Ly6/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 1105
    .line 1106
    .line 1107
    move-result v3

    .line 1108
    if-lez v3, :cond_19

    .line 1109
    .line 1110
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v2

    .line 1114
    goto :goto_10

    .line 1115
    :cond_19
    const-string v2, "string"

    .line 1116
    .line 1117
    invoke-static {v1, v5, v2}, Ly6/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 1118
    .line 1119
    .line 1120
    move-result v2

    .line 1121
    if-lez v2, :cond_1a

    .line 1122
    .line 1123
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v2

    .line 1127
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v2

    .line 1131
    goto :goto_10

    .line 1132
    :cond_1a
    const/4 v2, 0x1

    .line 1133
    :goto_10
    if-nez v2, :cond_1c

    .line 1134
    .line 1135
    move-object/from16 v2, v31

    .line 1136
    .line 1137
    const/4 v7, 0x2

    .line 1138
    invoke-static {v2, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v3

    .line 1142
    if-eqz v3, :cond_1b

    .line 1143
    .line 1144
    const-string v3, "Configured not to require a build ID."

    .line 1145
    .line 1146
    const/4 v5, 0x0

    .line 1147
    invoke-static {v2, v3, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1148
    .line 1149
    .line 1150
    :cond_1b
    move-object/from16 v6, v30

    .line 1151
    .line 1152
    goto :goto_11

    .line 1153
    :cond_1c
    move-object/from16 v6, v30

    .line 1154
    .line 1155
    move-object/from16 v2, v31

    .line 1156
    .line 1157
    iget-object v3, v6, Ly6/a;->b:Ljava/lang/String;

    .line 1158
    .line 1159
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1160
    .line 1161
    .line 1162
    move-result v3

    .line 1163
    if-nez v3, :cond_21

    .line 1164
    .line 1165
    :goto_11
    new-instance v3, Ly6/e;

    .line 1166
    .line 1167
    invoke-direct {v3}, Ly6/e;-><init>()V

    .line 1168
    .line 1169
    .line 1170
    iget-object v3, v3, Ly6/e;->a:Ljava/lang/String;

    .line 1171
    .line 1172
    :try_start_2
    new-instance v5, Lk4/E;

    .line 1173
    .line 1174
    const-string v7, "crash_marker"

    .line 1175
    .line 1176
    const/16 v8, 0x18

    .line 1177
    .line 1178
    invoke-direct {v5, v7, v8, v0}, Lk4/E;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1179
    .line 1180
    .line 1181
    iput-object v5, v15, Ly6/p;->f:Lk4/E;

    .line 1182
    .line 1183
    new-instance v5, Lk4/E;

    .line 1184
    .line 1185
    const-string v7, "initialization_marker"

    .line 1186
    .line 1187
    invoke-direct {v5, v7, v8, v0}, Lk4/E;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1188
    .line 1189
    .line 1190
    iput-object v5, v15, Ly6/p;->e:Lk4/E;

    .line 1191
    .line 1192
    new-instance v5, LE6/e;

    .line 1193
    .line 1194
    move-object/from16 v7, v41

    .line 1195
    .line 1196
    invoke-direct {v5, v3, v0, v7}, LE6/e;-><init>(Ljava/lang/String;LE6/e;Lz6/d;)V

    .line 1197
    .line 1198
    .line 1199
    new-instance v8, LA6/f;

    .line 1200
    .line 1201
    invoke-direct {v8, v0}, LA6/f;-><init>(LE6/e;)V

    .line 1202
    .line 1203
    .line 1204
    new-instance v0, LA1/g;

    .line 1205
    .line 1206
    new-instance v9, Lz2/a;

    .line 1207
    .line 1208
    const/4 v14, 0x7

    .line 1209
    invoke-direct {v9, v14}, Lz2/a;-><init>(I)V

    .line 1210
    .line 1211
    .line 1212
    const/4 v10, 0x1

    .line 1213
    new-array v10, v10, [LH6/a;

    .line 1214
    .line 1215
    const/16 v29, 0x0

    .line 1216
    .line 1217
    aput-object v9, v10, v29

    .line 1218
    .line 1219
    invoke-direct {v0, v10}, LA1/g;-><init>([LH6/a;)V

    .line 1220
    .line 1221
    .line 1222
    iget-object v9, v15, Ly6/p;->n:Lf5/o;

    .line 1223
    .line 1224
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1225
    .line 1226
    .line 1227
    new-instance v10, Lv6/b;

    .line 1228
    .line 1229
    invoke-direct {v10, v5}, Lv6/b;-><init>(LE6/e;)V

    .line 1230
    .line 1231
    .line 1232
    new-instance v11, Lj2/b;

    .line 1233
    .line 1234
    const/16 v12, 0x12

    .line 1235
    .line 1236
    invoke-direct {v11, v12, v10}, Lj2/b;-><init>(ILjava/lang/Object;)V

    .line 1237
    .line 1238
    .line 1239
    iget-object v9, v9, Lf5/o;->b:Ljava/lang/Object;

    .line 1240
    .line 1241
    check-cast v9, Ls6/n;

    .line 1242
    .line 1243
    invoke-virtual {v9, v11}, Ls6/n;->a(LS6/a;)V

    .line 1244
    .line 1245
    .line 1246
    iget-object v9, v15, Ly6/p;->a:Landroid/content/Context;

    .line 1247
    .line 1248
    iget-object v10, v15, Ly6/p;->h:Ly6/u;

    .line 1249
    .line 1250
    iget-object v11, v15, Ly6/p;->i:LE6/e;

    .line 1251
    .line 1252
    iget-object v12, v15, Ly6/p;->c:Lk4/E;

    .line 1253
    .line 1254
    iget-object v13, v15, Ly6/p;->l:Ly6/i;

    .line 1255
    .line 1256
    iget-object v14, v15, Ly6/p;->o:Lz6/d;

    .line 1257
    .line 1258
    move-object/from16 v48, v0

    .line 1259
    .line 1260
    move-object/from16 v49, v4

    .line 1261
    .line 1262
    move-object/from16 v47, v5

    .line 1263
    .line 1264
    move-object/from16 v45, v6

    .line 1265
    .line 1266
    move-object/from16 v46, v8

    .line 1267
    .line 1268
    move-object/from16 v42, v9

    .line 1269
    .line 1270
    move-object/from16 v43, v10

    .line 1271
    .line 1272
    move-object/from16 v44, v11

    .line 1273
    .line 1274
    move-object/from16 v50, v12

    .line 1275
    .line 1276
    move-object/from16 v51, v13

    .line 1277
    .line 1278
    move-object/from16 v52, v14

    .line 1279
    .line 1280
    invoke-static/range {v42 .. v52}, Lp/c1;->e(Landroid/content/Context;Ly6/u;LE6/e;Ly6/a;LA6/f;LE6/e;LA1/g;LG6/e;Lk4/E;Ly6/i;Lz6/d;)Lp/c1;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v51

    .line 1284
    move-object/from16 v30, v45

    .line 1285
    .line 1286
    move-object/from16 v0, v49

    .line 1287
    .line 1288
    new-instance v42, Ly6/l;

    .line 1289
    .line 1290
    iget-object v4, v15, Ly6/p;->a:Landroid/content/Context;

    .line 1291
    .line 1292
    iget-object v5, v15, Ly6/p;->h:Ly6/u;

    .line 1293
    .line 1294
    iget-object v6, v15, Ly6/p;->b:LD4/v;

    .line 1295
    .line 1296
    iget-object v8, v15, Ly6/p;->i:LE6/e;

    .line 1297
    .line 1298
    iget-object v9, v15, Ly6/p;->f:Lk4/E;

    .line 1299
    .line 1300
    iget-object v10, v15, Ly6/p;->m:Lv6/a;

    .line 1301
    .line 1302
    iget-object v11, v15, Ly6/p;->k:Lu6/a;

    .line 1303
    .line 1304
    iget-object v12, v15, Ly6/p;->l:Ly6/i;

    .line 1305
    .line 1306
    iget-object v13, v15, Ly6/p;->o:Lz6/d;

    .line 1307
    .line 1308
    move-object/from16 v43, v4

    .line 1309
    .line 1310
    move-object/from16 v44, v5

    .line 1311
    .line 1312
    move-object/from16 v45, v6

    .line 1313
    .line 1314
    move-object/from16 v52, v10

    .line 1315
    .line 1316
    move-object/from16 v53, v11

    .line 1317
    .line 1318
    move-object/from16 v54, v12

    .line 1319
    .line 1320
    move-object/from16 v55, v13

    .line 1321
    .line 1322
    move-object/from16 v48, v30

    .line 1323
    .line 1324
    move-object/from16 v50, v46

    .line 1325
    .line 1326
    move-object/from16 v49, v47

    .line 1327
    .line 1328
    move-object/from16 v46, v8

    .line 1329
    .line 1330
    move-object/from16 v47, v9

    .line 1331
    .line 1332
    invoke-direct/range {v42 .. v55}, Ly6/l;-><init>(Landroid/content/Context;Ly6/u;LD4/v;LE6/e;Lk4/E;Ly6/a;LE6/e;LA6/f;Lp/c1;Lv6/a;Lu6/a;Ly6/i;Lz6/d;)V

    .line 1333
    .line 1334
    .line 1335
    move-object/from16 v4, v42

    .line 1336
    .line 1337
    iput-object v4, v15, Ly6/p;->g:Ly6/l;

    .line 1338
    .line 1339
    iget-object v4, v15, Ly6/p;->e:Lk4/E;

    .line 1340
    .line 1341
    iget-object v5, v4, Lk4/E;->b:Ljava/lang/Object;

    .line 1342
    .line 1343
    check-cast v5, Ljava/lang/String;

    .line 1344
    .line 1345
    iget-object v4, v4, Lk4/E;->c:Ljava/lang/Object;

    .line 1346
    .line 1347
    check-cast v4, LE6/e;

    .line 1348
    .line 1349
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1350
    .line 1351
    .line 1352
    new-instance v6, Ljava/io/File;

    .line 1353
    .line 1354
    iget-object v4, v4, LE6/e;->c:Ljava/lang/Object;

    .line 1355
    .line 1356
    check-cast v4, Ljava/io/File;

    .line 1357
    .line 1358
    invoke-direct {v6, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 1362
    .line 1363
    .line 1364
    move-result v4

    .line 1365
    iget-object v5, v7, Lz6/d;->a:Lz6/b;

    .line 1366
    .line 1367
    iget-object v5, v5, Lz6/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 1368
    .line 1369
    new-instance v6, LG6/d;

    .line 1370
    .line 1371
    const/4 v10, 0x3

    .line 1372
    invoke-direct {v6, v10, v15}, LG6/d;-><init>(ILjava/lang/Object;)V

    .line 1373
    .line 1374
    .line 1375
    invoke-interface {v5, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 1379
    :try_start_3
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1380
    .line 1381
    const-wide/16 v8, 0x3

    .line 1382
    .line 1383
    invoke-interface {v5, v8, v9, v6}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v5

    .line 1387
    check-cast v5, Ljava/lang/Boolean;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 1388
    .line 1389
    :try_start_4
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1390
    .line 1391
    invoke-virtual {v6, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 1392
    .line 1393
    .line 1394
    :catch_0
    iget-object v5, v15, Ly6/p;->g:Ly6/l;

    .line 1395
    .line 1396
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v6

    .line 1400
    iget-object v8, v5, Ly6/l;->e:Lz6/d;

    .line 1401
    .line 1402
    iget-object v8, v8, Lz6/d;->a:Lz6/b;

    .line 1403
    .line 1404
    new-instance v9, LA6/r;

    .line 1405
    .line 1406
    const/16 v12, 0x1c

    .line 1407
    .line 1408
    invoke-direct {v9, v5, v12, v3}, LA6/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v8, v9}, Lz6/b;->a(Ljava/lang/Runnable;)Lf5/q;

    .line 1412
    .line 1413
    .line 1414
    new-instance v3, Lf5/o;

    .line 1415
    .line 1416
    const/16 v8, 0x18

    .line 1417
    .line 1418
    invoke-direct {v3, v8, v5}, Lf5/o;-><init>(ILjava/lang/Object;)V

    .line 1419
    .line 1420
    .line 1421
    new-instance v8, Ly6/r;

    .line 1422
    .line 1423
    iget-object v9, v5, Ly6/l;->j:Lv6/a;

    .line 1424
    .line 1425
    invoke-direct {v8, v3, v0, v6, v9}, Ly6/r;-><init>(Lf5/o;LG6/e;Ljava/lang/Thread$UncaughtExceptionHandler;Lv6/a;)V

    .line 1426
    .line 1427
    .line 1428
    iput-object v8, v5, Ly6/l;->n:Ly6/r;

    .line 1429
    .line 1430
    invoke-static {v8}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 1431
    .line 1432
    .line 1433
    if-eqz v4, :cond_1d

    .line 1434
    .line 1435
    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    .line 1436
    .line 1437
    invoke-virtual {v1, v3}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 1438
    .line 1439
    .line 1440
    move-result v3

    .line 1441
    if-nez v3, :cond_1e

    .line 1442
    .line 1443
    const-string v3, "connectivity"

    .line 1444
    .line 1445
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v1

    .line 1449
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 1450
    .line 1451
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v1

    .line 1455
    if-eqz v1, :cond_1d

    .line 1456
    .line 1457
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    .line 1458
    .line 1459
    .line 1460
    move-result v1

    .line 1461
    if-eqz v1, :cond_1d

    .line 1462
    .line 1463
    goto :goto_12

    .line 1464
    :cond_1d
    const/4 v10, 0x3

    .line 1465
    goto :goto_13

    .line 1466
    :cond_1e
    :goto_12
    const-string v1, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    .line 1467
    .line 1468
    const/4 v10, 0x3

    .line 1469
    invoke-static {v2, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1470
    .line 1471
    .line 1472
    move-result v3

    .line 1473
    if-eqz v3, :cond_1f

    .line 1474
    .line 1475
    const/4 v5, 0x0

    .line 1476
    invoke-static {v2, v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1477
    .line 1478
    .line 1479
    :cond_1f
    invoke-virtual {v15, v0}, Ly6/p;->b(LG6/e;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 1480
    .line 1481
    .line 1482
    goto :goto_15

    .line 1483
    :catch_1
    move-exception v0

    .line 1484
    goto :goto_14

    .line 1485
    :goto_13
    invoke-static {v2, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1486
    .line 1487
    .line 1488
    move-result v1

    .line 1489
    if-eqz v1, :cond_20

    .line 1490
    .line 1491
    const-string v1, "Successfully configured exception handler."

    .line 1492
    .line 1493
    const/4 v5, 0x0

    .line 1494
    invoke-static {v2, v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1495
    .line 1496
    .line 1497
    :cond_20
    new-instance v1, Ly6/m;

    .line 1498
    .line 1499
    const/4 v10, 0x0

    .line 1500
    invoke-direct {v1, v15, v0, v10}, Ly6/m;-><init>(Ly6/p;LG6/e;I)V

    .line 1501
    .line 1502
    .line 1503
    iget-object v0, v7, Lz6/d;->a:Lz6/b;

    .line 1504
    .line 1505
    invoke-virtual {v0, v1}, Lz6/b;->a(Ljava/lang/Runnable;)Lf5/q;

    .line 1506
    .line 1507
    .line 1508
    goto :goto_15

    .line 1509
    :goto_14
    const-string v1, "Crashlytics was not started due to an exception during initialization"

    .line 1510
    .line 1511
    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1512
    .line 1513
    .line 1514
    const/4 v5, 0x0

    .line 1515
    iput-object v5, v15, Ly6/p;->g:Ly6/l;

    .line 1516
    .line 1517
    :goto_15
    new-instance v0, Lu6/b;

    .line 1518
    .line 1519
    invoke-direct {v0, v15}, Lu6/b;-><init>(Ly6/p;)V

    .line 1520
    .line 1521
    .line 1522
    goto :goto_17

    .line 1523
    :cond_21
    const-string v0, "."

    .line 1524
    .line 1525
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1526
    .line 1527
    .line 1528
    const-string v1, ".     |  | "

    .line 1529
    .line 1530
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1531
    .line 1532
    .line 1533
    const-string v1, ".     |  |"

    .line 1534
    .line 1535
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1536
    .line 1537
    .line 1538
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1539
    .line 1540
    .line 1541
    const-string v3, ".   \\ |  | /"

    .line 1542
    .line 1543
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1544
    .line 1545
    .line 1546
    const-string v3, ".    \\    /"

    .line 1547
    .line 1548
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1549
    .line 1550
    .line 1551
    const-string v3, ".     \\  /"

    .line 1552
    .line 1553
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1554
    .line 1555
    .line 1556
    const-string v3, ".      \\/"

    .line 1557
    .line 1558
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1559
    .line 1560
    .line 1561
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1562
    .line 1563
    .line 1564
    const-string v3, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    .line 1565
    .line 1566
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1567
    .line 1568
    .line 1569
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1570
    .line 1571
    .line 1572
    const-string v4, ".      /\\"

    .line 1573
    .line 1574
    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1575
    .line 1576
    .line 1577
    const-string v4, ".     /  \\"

    .line 1578
    .line 1579
    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1580
    .line 1581
    .line 1582
    const-string v4, ".    /    \\"

    .line 1583
    .line 1584
    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1585
    .line 1586
    .line 1587
    const-string v4, ".   / |  | \\"

    .line 1588
    .line 1589
    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1590
    .line 1591
    .line 1592
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1593
    .line 1594
    .line 1595
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1596
    .line 1597
    .line 1598
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1599
    .line 1600
    .line 1601
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1602
    .line 1603
    .line 1604
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1605
    .line 1606
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1607
    .line 1608
    .line 1609
    throw v0

    .line 1610
    :goto_16
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1611
    throw v0

    .line 1612
    :catchall_0
    move-exception v0

    .line 1613
    goto :goto_16

    .line 1614
    :catch_2
    move-exception v0

    .line 1615
    move-object v2, v8

    .line 1616
    const-string v1, "Error retrieving app package info."

    .line 1617
    .line 1618
    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1619
    .line 1620
    .line 1621
    const/4 v0, 0x0

    .line 1622
    :goto_17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1623
    .line 1624
    .line 1625
    move-result-wide v3

    .line 1626
    sub-long v3, v3, v39

    .line 1627
    .line 1628
    const-wide/16 v5, 0x10

    .line 1629
    .line 1630
    cmp-long v1, v3, v5

    .line 1631
    .line 1632
    if-lez v1, :cond_22

    .line 1633
    .line 1634
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1635
    .line 1636
    const-string v5, "Initializing Crashlytics blocked main for "

    .line 1637
    .line 1638
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1642
    .line 1643
    .line 1644
    const-string v3, " ms"

    .line 1645
    .line 1646
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v1

    .line 1653
    const/4 v10, 0x3

    .line 1654
    invoke-static {v2, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1655
    .line 1656
    .line 1657
    move-result v3

    .line 1658
    if-eqz v3, :cond_22

    .line 1659
    .line 1660
    const/4 v5, 0x0

    .line 1661
    invoke-static {v2, v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1662
    .line 1663
    .line 1664
    :cond_22
    return-object v0
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
.end method

.method public h(LS6/b;)V
    .locals 4

    .line 1
    iget v0, p0, Lj2/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LS6/b;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lf7/a;

    .line 11
    .line 12
    check-cast p1, Lc7/n;

    .line 13
    .line 14
    invoke-virtual {p1}, Lc7/n;->a()Lc7/e;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p1, p1, Lc7/e;->i:Lcom/google/firebase/messaging/s;

    .line 19
    .line 20
    iget-object v0, p1, Lcom/google/firebase/messaging/s;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/Set;

    .line 23
    .line 24
    iget-object v1, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lv6/b;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget-object v0, p1, Lcom/google/firebase/messaging/s;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ld7/d;

    .line 34
    .line 35
    invoke-virtual {v0}, Ld7/d;->b()Lf5/h;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v2, Lc7/d;

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    invoke-direct {v2, p1, v0, v1, v3}, Lc7/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p1, Lcom/google/firebase/messaging/s;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 48
    .line 49
    invoke-virtual {v0, p1, v2}, Lf5/h;->d(Ljava/util/concurrent/Executor;Lf5/e;)Lf5/q;

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x3

    .line 53
    const-string v0, "FirebaseCrashlytics"

    .line 54
    .line 55
    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    const-string p1, "Registering RemoteConfig Rollouts subscriber"

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-static {v0, p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    .line 66
    .line 67
    :cond_0
    return-void

    .line 68
    :pswitch_0
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lv6/a;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const-string v1, "FirebaseCrashlytics"

    .line 76
    .line 77
    const/4 v2, 0x3

    .line 78
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    const-string v2, "Crashlytics native component now available."

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-static {v1, v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-interface {p1}, LS6/b;->get()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Lv6/a;

    .line 95
    .line 96
    iget-object v0, v0, Lv6/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 97
    .line 98
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
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
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public i(Lf5/h;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lj2/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Runnable;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-static {p1}, Ls8/n;->p(Ljava/lang/Object;)Lf5/q;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :pswitch_0
    iget-object p1, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ly6/j;

    .line 22
    .line 23
    invoke-virtual {p1}, Ly6/j;->call()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lf5/h;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    iget-object p1, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    return-object p1

    .line 39
    :pswitch_2
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lp/c1;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lf5/h;->j()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {p1}, Lf5/h;->g()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Ly6/b;

    .line 57
    .line 58
    sget-object v0, Lv6/c;->a:Lv6/c;

    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "Crashlytics report successfully enqueued to DataTransport: "

    .line 63
    .line 64
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p1, Ly6/b;->b:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Lv6/c;->c(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p1, Ly6/b;->c:Ljava/io/File;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    new-instance v1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v2, "Deleted report file: "

    .line 90
    .line 91
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {v0, p1}, Lv6/c;->c(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v2, "Crashlytics could not delete report file: "

    .line 112
    .line 113
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const/4 v1, 0x0

    .line 128
    invoke-virtual {v0, p1, v1}, Lv6/c;->g(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 129
    .line 130
    .line 131
    :goto_0
    const/4 p1, 0x1

    .line 132
    goto :goto_1

    .line 133
    :cond_1
    invoke-virtual {p1}, Lf5/h;->f()Ljava/lang/Exception;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    const-string v0, "FirebaseCrashlytics"

    .line 138
    .line 139
    const-string v1, "Crashlytics report could not be enqueued to DataTransport"

    .line 140
    .line 141
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 142
    .line 143
    .line 144
    const/4 p1, 0x0

    .line 145
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    return-object p1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lj2/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, Lj3/p0;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    iget-object v1, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lj3/Y;

    .line 12
    .line 13
    invoke-interface {p1, v1, v0}, Lj3/p0;->K(Lj3/Y;I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_1
    check-cast p1, Lj3/p0;

    .line 18
    .line 19
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lj3/m0;

    .line 22
    .line 23
    invoke-interface {p1, v0}, Lj3/p0;->A(Lj3/m0;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_2
    check-cast p1, Lk3/j;

    .line 28
    .line 29
    iget v0, p1, Lk3/j;->x:I

    .line 30
    .line 31
    iget-object v1, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lm3/d;

    .line 34
    .line 35
    iget v2, v1, Lm3/d;->g:I

    .line 36
    .line 37
    add-int/2addr v0, v2

    .line 38
    iput v0, p1, Lk3/j;->x:I

    .line 39
    .line 40
    iget v0, p1, Lk3/j;->y:I

    .line 41
    .line 42
    iget v1, v1, Lm3/d;->e:I

    .line 43
    .line 44
    add-int/2addr v0, v1

    .line 45
    iput v0, p1, Lk3/j;->y:I

    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_3
    check-cast p1, Lk3/j;

    .line 49
    .line 50
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lj3/m;

    .line 53
    .line 54
    iput-object v0, p1, Lk3/j;->n:Lj3/m;

    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_4
    check-cast p1, Lk3/j;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, LN3/v;

    .line 65
    .line 66
    iget v0, v0, LN3/v;->a:I

    .line 67
    .line 68
    iput v0, p1, Lk3/j;->v:I

    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_5
    check-cast p1, Lj3/p0;

    .line 72
    .line 73
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lj3/l;

    .line 76
    .line 77
    invoke-interface {p1, v0}, Lj3/p0;->f(Lj3/l;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_6
    check-cast p1, Lj3/p0;

    .line 82
    .line 83
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, LD3/c;

    .line 86
    .line 87
    invoke-interface {p1, v0}, Lj3/p0;->t(LD3/c;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_7
    check-cast p1, Lj3/p0;

    .line 92
    .line 93
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lj3/A;

    .line 96
    .line 97
    iget-object v0, v0, Lj3/A;->a:Lj3/D;

    .line 98
    .line 99
    iget-object v0, v0, Lj3/D;->l0:Lj3/b0;

    .line 100
    .line 101
    invoke-interface {p1, v0}, Lj3/p0;->B(Lj3/b0;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_8
    check-cast p1, Lj3/p0;

    .line 106
    .line 107
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, LY3/c;

    .line 110
    .line 111
    invoke-interface {p1, v0}, Lj3/p0;->y(LY3/c;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_9
    check-cast p1, Lj3/p0;

    .line 116
    .line 117
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {p1, v0}, Lj3/p0;->o(Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_a
    check-cast p1, Lj3/p0;

    .line 126
    .line 127
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Li4/v;

    .line 130
    .line 131
    invoke-interface {p1, v0}, Lj3/p0;->r(Li4/v;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :pswitch_b
    check-cast p1, Lj3/p0;

    .line 136
    .line 137
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Lj3/b0;

    .line 140
    .line 141
    invoke-interface {p1, v0}, Lj3/p0;->B(Lj3/b0;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_0
        :pswitch_1
    .end packed-switch
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public k(J)J
    .locals 9

    .line 1
    iget-object v0, p0, Lj2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq3/n;

    .line 4
    .line 5
    iget v1, v0, Lq3/n;->e:I

    .line 6
    .line 7
    int-to-long v1, v1

    .line 8
    mul-long/2addr p1, v1

    .line 9
    const-wide/32 v1, 0xf4240

    .line 10
    .line 11
    .line 12
    div-long v3, p1, v1

    .line 13
    .line 14
    iget-wide p1, v0, Lq3/n;->j:J

    .line 15
    .line 16
    const-wide/16 v0, 0x1

    .line 17
    .line 18
    sub-long v7, p1, v0

    .line 19
    .line 20
    const-wide/16 v5, 0x0

    .line 21
    .line 22
    invoke-static/range {v3 .. v8}, Ll4/y;->j(JJJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    return-wide p1
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
