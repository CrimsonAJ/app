.class public final Lco/notix/jd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/md;


# instance fields
.field public b:Lco/notix/log/LogLevel;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lco/notix/log/LogLevel;->IMPORTANT:Lco/notix/log/LogLevel;

    iput-object v0, p0, Lco/notix/jd;->b:Lco/notix/log/LogLevel;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lco/notix/jd;->b:Lco/notix/log/LogLevel;

    .line 4
    sget-object v1, Lco/notix/log/LogLevel;->IMPORTANT:Lco/notix/log/LogLevel;

    invoke-virtual {v0, v1}, Lco/notix/log/LogLevel;->isGreaterOrEqual$sdk_release(Lco/notix/log/LogLevel;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Notix"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lco/notix/jd;->b:Lco/notix/log/LogLevel;

    .line 2
    sget-object v1, Lco/notix/log/LogLevel;->ERROR:Lco/notix/log/LogLevel;

    invoke-virtual {v0, v1}, Lco/notix/log/LogLevel;->isGreaterOrEqual$sdk_release(Lco/notix/log/LogLevel;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Notix"

    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "msg"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lco/notix/jd;->b:Lco/notix/log/LogLevel;

    .line 7
    .line 8
    sget-object v1, Lco/notix/log/LogLevel;->FULL:Lco/notix/log/LogLevel;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lco/notix/log/LogLevel;->isGreaterOrEqual$sdk_release(Lco/notix/log/LogLevel;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, "Notix"

    .line 17
    .line 18
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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

.method public final setLogLevel(Lco/notix/log/LogLevel;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/notix/jd;->b:Lco/notix/log/LogLevel;

    return-void
.end method
