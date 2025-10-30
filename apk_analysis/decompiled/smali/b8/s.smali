.class public final Lb8/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb8/e;

.field public final synthetic c:LG7/j;


# direct methods
.method public constructor <init>(Lb8/e;LO7/p;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb8/s;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lb8/s;->b:Lb8/e;

    .line 10
    .line 11
    check-cast p2, LG7/j;

    .line 12
    .line 13
    iput-object p2, p0, Lb8/s;->c:LG7/j;

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lb8/s;->b:Lb8/e;

    .line 20
    .line 21
    check-cast p2, LG7/j;

    .line 22
    .line 23
    iput-object p2, p0, Lb8/s;->c:LG7/j;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public final collect(Lb8/f;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lb8/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lb8/u;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lb8/u;

    .line 12
    .line 13
    iget v1, v0, Lb8/u;->s:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Lb8/u;->s:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lb8/u;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lb8/u;-><init>(Lb8/s;LE7/d;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lb8/u;->r:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, LF7/a;->a:LF7/a;

    .line 33
    .line 34
    iget v2, v0, Lb8/u;->s:I

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lb8/u;->u:Lb8/q;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Lc8/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :catch_0
    move-exception p2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, Lb8/s;->b:Lb8/e;

    .line 61
    .line 62
    new-instance v2, Lb8/q;

    .line 63
    .line 64
    iget-object v4, p0, Lb8/s;->c:LG7/j;

    .line 65
    .line 66
    invoke-direct {v2, v4, p1}, Lb8/q;-><init>(LO7/p;Lb8/f;)V

    .line 67
    .line 68
    .line 69
    :try_start_1
    iput-object v2, v0, Lb8/u;->u:Lb8/q;

    .line 70
    .line 71
    iput v3, v0, Lb8/u;->s:I

    .line 72
    .line 73
    invoke-interface {p2, v2, v0}, Lb8/e;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_1
    .catch Lc8/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 77
    if-ne p1, v1, :cond_3

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :catch_1
    move-exception p2

    .line 81
    move-object p1, v2

    .line 82
    :goto_1
    iget-object v0, p2, Lc8/a;->a:Lb8/f;

    .line 83
    .line 84
    if-ne v0, p1, :cond_4

    .line 85
    .line 86
    :cond_3
    :goto_2
    sget-object v1, LA7/n;->a:LA7/n;

    .line 87
    .line 88
    :goto_3
    return-object v1

    .line 89
    :cond_4
    throw p2

    .line 90
    :pswitch_0
    new-instance v0, Lkotlin/jvm/internal/k;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lb8/c;

    .line 96
    .line 97
    iget-object v2, p0, Lb8/s;->c:LG7/j;

    .line 98
    .line 99
    invoke-direct {v1, v0, p1, v2}, Lb8/c;-><init>(Lkotlin/jvm/internal/k;Lb8/f;LO7/p;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lb8/s;->b:Lb8/e;

    .line 103
    .line 104
    invoke-interface {p1, v1, p2}, Lb8/e;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    sget-object p2, LF7/a;->a:LF7/a;

    .line 109
    .line 110
    if-ne p1, p2, :cond_5

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    sget-object p1, LA7/n;->a:LA7/n;

    .line 114
    .line 115
    :goto_4
    return-object p1

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
