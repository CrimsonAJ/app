.class public final Li7/O;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li7/O;

.field public static final b:Lo1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li7/O;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li7/O;->a:Li7/O;

    .line 7
    .line 8
    new-instance v0, LN6/d;

    .line 9
    .line 10
    invoke-direct {v0}, LN6/d;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v1, Li7/g;->a:Li7/g;

    .line 14
    .line 15
    const-class v2, Li7/N;

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, LN6/d;->a(Ljava/lang/Class;LL6/d;)LM6/a;

    .line 18
    .line 19
    .line 20
    sget-object v1, Li7/h;->a:Li7/h;

    .line 21
    .line 22
    const-class v2, Li7/X;

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, LN6/d;->a(Ljava/lang/Class;LL6/d;)LM6/a;

    .line 25
    .line 26
    .line 27
    sget-object v1, Li7/e;->a:Li7/e;

    .line 28
    .line 29
    const-class v2, Li7/k;

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, LN6/d;->a(Ljava/lang/Class;LL6/d;)LM6/a;

    .line 32
    .line 33
    .line 34
    sget-object v1, Li7/d;->a:Li7/d;

    .line 35
    .line 36
    const-class v2, Li7/b;

    .line 37
    .line 38
    invoke-virtual {v0, v2, v1}, LN6/d;->a(Ljava/lang/Class;LL6/d;)LM6/a;

    .line 39
    .line 40
    .line 41
    sget-object v1, Li7/c;->a:Li7/c;

    .line 42
    .line 43
    const-class v2, Li7/a;

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, LN6/d;->a(Ljava/lang/Class;LL6/d;)LM6/a;

    .line 46
    .line 47
    .line 48
    sget-object v1, Li7/f;->a:Li7/f;

    .line 49
    .line 50
    const-class v2, Li7/D;

    .line 51
    .line 52
    invoke-virtual {v0, v2, v1}, LN6/d;->a(Ljava/lang/Class;LL6/d;)LM6/a;

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    iput-boolean v1, v0, LN6/d;->d:Z

    .line 57
    .line 58
    new-instance v1, Lo1/f;

    .line 59
    .line 60
    const/16 v2, 0xc

    .line 61
    .line 62
    invoke-direct {v1, v2, v0}, Lo1/f;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sput-object v1, Li7/O;->b:Lo1/f;

    .line 66
    .line 67
    return-void
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

.method public static a(Ll6/f;)Li7/b;
    .locals 15

    .line 1
    invoke-virtual {p0}, Ll6/f;->a()V

    .line 2
    .line 3
    .line 4
    const-string v0, "firebaseApp.applicationContext"

    .line 5
    .line 6
    iget-object v1, p0, Ll6/f;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v5, 0x1c

    .line 27
    .line 28
    if-lt v4, v5, :cond_0

    .line 29
    .line 30
    invoke-static {v0}, Lp0/b;->b(Landroid/content/pm/PackageInfo;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget v4, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 40
    .line 41
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :goto_0
    new-instance v8, Li7/b;

    .line 46
    .line 47
    invoke-virtual {p0}, Ll6/f;->a()V

    .line 48
    .line 49
    .line 50
    iget-object v6, p0, Ll6/f;->c:Ll6/i;

    .line 51
    .line 52
    iget-object v9, v6, Ll6/i;->b:Ljava/lang/String;

    .line 53
    .line 54
    const-string v6, "firebaseApp.options.applicationId"

    .line 55
    .line 56
    invoke-static {v9, v6}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 60
    .line 61
    const-string v7, "MODEL"

    .line 62
    .line 63
    invoke-static {v6, v7}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 67
    .line 68
    const-string v7, "RELEASE"

    .line 69
    .line 70
    invoke-static {v6, v7}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    move v6, v2

    .line 74
    new-instance v2, Li7/a;

    .line 75
    .line 76
    const-string v7, "packageName"

    .line 77
    .line 78
    invoke-static {v3, v7}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 82
    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    move-object v0, v4

    .line 86
    :cond_1
    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 87
    .line 88
    const-string v10, "MANUFACTURER"

    .line 89
    .line 90
    invoke-static {v7, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ll6/f;->a()V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    invoke-static {v1}, Li7/t;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    move v12, v6

    .line 109
    :cond_2
    if-ge v12, v11, :cond_3

    .line 110
    .line 111
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    add-int/lit8 v12, v12, 0x1

    .line 116
    .line 117
    move-object v14, v13

    .line 118
    check-cast v14, Li7/D;

    .line 119
    .line 120
    iget v14, v14, Li7/D;->b:I

    .line 121
    .line 122
    if-ne v14, v7, :cond_2

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    const/4 v13, 0x0

    .line 126
    :goto_1
    check-cast v13, Li7/D;

    .line 127
    .line 128
    if-nez v13, :cond_7

    .line 129
    .line 130
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 131
    .line 132
    const/16 v11, 0x21

    .line 133
    .line 134
    if-le v10, v11, :cond_4

    .line 135
    .line 136
    invoke-static {}, LQ/d;->k()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    const-string v10, "myProcessName()"

    .line 141
    .line 142
    invoke-static {v5, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_4
    if-lt v10, v5, :cond_5

    .line 147
    .line 148
    invoke-static {}, LC5/f;->r()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    if-eqz v5, :cond_5

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_5
    invoke-static {}, LK4/b;->b()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    if-eqz v5, :cond_6

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_6
    const-string v5, ""

    .line 163
    .line 164
    :goto_2
    new-instance v13, Li7/D;

    .line 165
    .line 166
    invoke-direct {v13, v7, v6, v5, v6}, Li7/D;-><init>(IILjava/lang/String;Z)V

    .line 167
    .line 168
    .line 169
    :cond_7
    move-object v6, v13

    .line 170
    invoke-virtual {p0}, Ll6/f;->a()V

    .line 171
    .line 172
    .line 173
    invoke-static {v1}, Li7/t;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    move-object v5, v4

    .line 178
    move-object v4, v0

    .line 179
    invoke-direct/range {v2 .. v7}, Li7/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li7/D;Ljava/util/ArrayList;)V

    .line 180
    .line 181
    .line 182
    invoke-direct {v8, v9, v2}, Li7/b;-><init>(Ljava/lang/String;Li7/a;)V

    .line 183
    .line 184
    .line 185
    return-object v8
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
