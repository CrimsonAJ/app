.class public final Lco/notix/kd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/md;


# static fields
.field public static final synthetic c:Lco/notix/kd;


# instance fields
.field public final synthetic b:Lco/notix/x8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/kd;

    invoke-direct {v0}, Lco/notix/kd;-><init>()V

    sput-object v0, Lco/notix/kd;->c:Lco/notix/kd;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lco/notix/wq;->e()Lco/notix/x8;

    move-result-object v0

    iput-object v0, p0, Lco/notix/kd;->b:Lco/notix/x8;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 2
    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/kd;->b:Lco/notix/x8;

    invoke-virtual {v0, p1}, Lco/notix/x8;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/kd;->b:Lco/notix/x8;

    invoke-virtual {v0, p1, p2}, Lco/notix/x8;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/kd;->b:Lco/notix/x8;

    invoke-virtual {v0, p1}, Lco/notix/x8;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final setLogLevel(Lco/notix/log/LogLevel;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/kd;->b:Lco/notix/x8;

    invoke-virtual {v0, p1}, Lco/notix/x8;->setLogLevel(Lco/notix/log/LogLevel;)V

    return-void
.end method
