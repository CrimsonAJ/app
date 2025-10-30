.class public final LM1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LH2/t;Lcom/anilab/android/ui/activity/MainActivity;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LM1/w;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/w;->b:Ljava/lang/Object;

    iput-object p2, p0, LM1/w;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq8/n;Lq8/r;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LM1/w;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/w;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LM1/w;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LM1/w;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/w;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lq8/n;

    .line 9
    .line 10
    iget-object v1, p0, LM1/w;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lq8/r;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    :try_start_0
    invoke-virtual {v1, v2, p0}, Lq8/r;->a(ZLM1/w;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    :cond_0
    const/4 v4, 0x0

    .line 23
    invoke-virtual {v1, v4, p0}, Lq8/r;->a(ZLM1/w;)Z

    .line 24
    .line 25
    .line 26
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    const/16 v4, 0x9

    .line 30
    .line 31
    invoke-virtual {v0, v2, v4, v3}, Lq8/n;->a(IILjava/io/IOException;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-static {v1}, Lk8/c;->d(Ljava/io/Closeable;)V

    .line 35
    .line 36
    .line 37
    goto :goto_3

    .line 38
    :catchall_0
    move-exception v2

    .line 39
    goto :goto_1

    .line 40
    :catch_0
    move-exception v2

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :try_start_1
    new-instance v2, Ljava/io/IOException;

    .line 43
    .line 44
    const-string v4, "Required SETTINGS preface not received"

    .line 45
    .line 46
    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    :goto_1
    const/4 v4, 0x3

    .line 51
    invoke-virtual {v0, v4, v4, v3}, Lq8/n;->a(IILjava/io/IOException;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Lk8/c;->d(Ljava/io/Closeable;)V

    .line 55
    .line 56
    .line 57
    throw v2

    .line 58
    :goto_2
    const/4 v3, 0x2

    .line 59
    invoke-virtual {v0, v3, v3, v2}, Lq8/n;->a(IILjava/io/IOException;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :goto_3
    sget-object v0, LA7/n;->a:LA7/n;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    :try_start_2
    new-instance v0, Landroid/content/Intent;

    .line 67
    .line 68
    const-string v1, "android.intent.action.VIEW"

    .line 69
    .line 70
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, LM1/w;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, LH2/t;

    .line 76
    .line 77
    iget-object v1, v1, LH2/t;->h:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, LM1/w;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Lcom/anilab/android/ui/activity/MainActivity;

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 91
    .line 92
    .line 93
    :catch_1
    sget-object v0, LA7/n;->a:LA7/n;

    .line 94
    .line 95
    return-object v0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
