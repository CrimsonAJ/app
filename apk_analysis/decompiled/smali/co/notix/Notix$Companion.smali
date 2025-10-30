.class public final Lco/notix/Notix$Companion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/Notix;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/notix/Notix;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lco/notix/Notix$Companion;


# instance fields
.field private final synthetic $$delegate_0:Lco/notix/Notix;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/Notix$Companion;

    invoke-direct {v0}, Lco/notix/Notix$Companion;-><init>()V

    sput-object v0, Lco/notix/Notix$Companion;->$$INSTANCE:Lco/notix/Notix$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lco/notix/wq;->p()Lco/notix/sg;

    move-result-object v0

    iput-object v0, p0, Lco/notix/Notix$Companion;->$$delegate_0:Lco/notix/Notix;

    return-void
.end method


# virtual methods
.method public getVersion()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lco/notix/Notix$Companion;->$$delegate_0:Lco/notix/Notix;

    invoke-interface {v0}, Lco/notix/Notix;->getVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setCallbackHandler(Lco/notix/callback/NotixCallbackHandler;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/Notix$Companion;->$$delegate_0:Lco/notix/Notix;

    invoke-interface {v0, p1}, Lco/notix/Notix;->setCallbackHandler(Lco/notix/callback/NotixCallbackHandler;)V

    return-void
.end method

.method public setLogLevel(Lco/notix/log/LogLevel;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "logLevel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/Notix$Companion;->$$delegate_0:Lco/notix/Notix;

    invoke-interface {v0, p1}, Lco/notix/Notix;->setLogLevel(Lco/notix/log/LogLevel;)V

    return-void
.end method

.method public setUserAgent(Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "userAgent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/Notix$Companion;->$$delegate_0:Lco/notix/Notix;

    invoke-interface {v0, p1}, Lco/notix/Notix;->setUserAgent(Ljava/lang/String;)V

    return-void
.end method
